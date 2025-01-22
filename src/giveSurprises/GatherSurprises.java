package giveSurprises;

import java.util.Random;

import surprise.Candies;
import surprise.FortuneCookie;
import surprise.ISurprise;
import surprise.MinionToy;

public final class GatherSurprises {

	private static final Random random = new Random();
	private static final int noOption = 3;

	private GatherSurprises() {
	}

	public static ISurprise[] gather(int n) {
		ISurprise[] array = new ISurprise[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = GatherSurprises.gather();
		}

		return array;
	}

	public static ISurprise gather() {
		switch (random.nextInt(noOption)) {
		case 0:
			return FortuneCookie.generate();
		case 1:
			return Candies.generate();
		case 2:
			return MinionToy.generate();
		}

		return null;
	}
}
