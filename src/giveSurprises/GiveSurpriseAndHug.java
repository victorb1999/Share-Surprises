package giveSurprises;

public class GiveSurpriseAndHug extends AbstractGiveSurprises {

	public GiveSurpriseAndHug(String type, int waitTime) {
		super(type, waitTime);
	}

	@Override
	void giveWithPassion() {
		System.out.println("Warm wishes and a big hug!");
	}
}
