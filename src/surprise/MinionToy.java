package surprise;

public class MinionToy implements ISurprise {

	private static final String[] names = { "Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim" };

	private String minionName;
	private static int counter = 0;

	public MinionToy(String name) {
		this.minionName = name;
	}

	@Override
	public void enjoy() {
		System.out.println("You got a minion named " + this.minionName + "!");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[Minion] name = ");
		sb.append(this.minionName);

		return sb.toString();
	}

	public static MinionToy generate() {
		int index = counter % names.length;
		MinionToy minion = new MinionToy(names[index]);
		counter++;

		return minion;
	}
}
