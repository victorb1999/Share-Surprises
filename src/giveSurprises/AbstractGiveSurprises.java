package giveSurprises;

import java.util.concurrent.TimeUnit;

import container.IBag;
import createContainer.BagFactory;
import surprise.ISurprise;

public abstract class AbstractGiveSurprises {

	private IBag container;
	private int waitTime;
	private BagFactory bagFactory;

	public AbstractGiveSurprises(String type, int waitTime) {
		this.waitTime = waitTime;
		this.bagFactory = BagFactory.getInstance();
		this.container = bagFactory.makeBag(type);
	}

	public void put(ISurprise newSurprise) {
		this.container.put(newSurprise);
	}

	public void put(IBag surprises) {
		this.container.put(surprises);
	}

	public void give() {
		this.container.takeOut().enjoy();
		giveWithPassion();
	}

	public void giveAll() {
		while (!this.container.isEmpty()) {
			ISurprise nextSurprise = this.container.takeOut();
			nextSurprise.enjoy();
			this.giveWithPassion();
			try {
				TimeUnit.SECONDS.sleep(waitTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public boolean isEmpty() {
		return this.container.isEmpty();
	}

	abstract void giveWithPassion();
}
