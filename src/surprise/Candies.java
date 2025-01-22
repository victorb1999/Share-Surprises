package surprise;

import java.util.Random;

public class Candies implements ISurprise {

	private static final String[] candies = { "chocolate", "jelly", "fruits", "vanilla" };
	private int numberOfCandies;
	private String typeOfCandies;
	private static final Random random = new Random();

	public Candies(int num, String type) {
		this.numberOfCandies = num;
		this.typeOfCandies = type;
	}

	@Override
	public void enjoy() {
		System.out.println("You received " + this.numberOfCandies + " " + this.typeOfCandies + " candies.");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Candies] number = ");
		sb.append(this.numberOfCandies);
		sb.append(", type = ");
		sb.append(this.typeOfCandies);

		return sb.toString();
	}

	public static Candies generate() {
		int type = random.nextInt(candies.length);
		int number = random.nextInt();
		Candies candy = new Candies(number, candies[type]);

		return candy;
	}
}