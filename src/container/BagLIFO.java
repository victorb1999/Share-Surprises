package container;

import java.util.ArrayList;

import surprise.ISurprise;

public class BagLIFO implements IBag {

	private ArrayList<ISurprise> giftList;

	public BagLIFO() {
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

		ISurprise toReturn = giftList.get(giftList.size() - 1);
		giftList.remove(giftList.size() - 1);

		return toReturn;
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
