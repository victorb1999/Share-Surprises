package container;

import java.util.ArrayList;
import java.util.Random;

import surprise.ISurprise;

public class BagRandom implements IBag {

	private ArrayList<ISurprise> giftList;
	private static final Random random = new Random();

	public BagRandom() {
		this.giftList = new ArrayList<ISurprise>();
	}

	@Override
	public void put(ISurprise newSurprise) {
		this.giftList.add(newSurprise);
	}

	@Override
	public void put(IBag bagOfSurprises) {
		while (!bagOfSurprises.isEmpty()) {
			ISurprise surpriseToAdd = bagOfSurprises.takeOut();
			this.put(surpriseToAdd);
		}
	}

	@Override
	public ISurprise takeOut() {
		if (this.isEmpty()) {
			return null;
		}
		int index = random.nextInt(giftList.size());
		ISurprise chosen = giftList.get(index);
		giftList.remove(index);

		return chosen;
	}

	@Override
	public boolean isEmpty() {
		return giftList.isEmpty();
	}

	@Override
	public int size() {
		return giftList.size();
	}
}
