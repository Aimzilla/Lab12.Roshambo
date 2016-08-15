package rockPaperScissor;

public abstract class Player {
	private String name;
	private String roshambo;

	public Player(String name, String roshambo) {
		super();
		setName(name);
		setRoshambo(roshambo);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoshambo() {
		return roshambo;
	}

	public void setRoshambo(String roshambo) {
		this.roshambo = roshambo;
	}

	public void printNameAndChoice() {
		System.out.println(name + ": " + getRoshambo());//is this causing my infinite loop??  doesn't appear so
	}
	
	public abstract String generateRoshambo();

	

	
}
