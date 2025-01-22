package createContainer;

import container.BagFIFO;
import container.BagLIFO;
import container.BagRandom;
import container.IBag;

public class BagFactory implements IBagFactory {

	private static BagFactory instance = new BagFactory();

	private BagFactory() {
	}

	public static BagFactory getInstance() {
		return instance;
	}

	@Override
	public IBag makeBag(String type) {
		switch (type.toLowerCase()) {
		case "random":
			return new BagRandom();
		case "fifo":
			return new BagFIFO();
		case "lifo":
			return new BagLIFO();
		}

		return null;

	}
}
