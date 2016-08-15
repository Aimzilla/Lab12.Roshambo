package rockPaperScissor;

public class RockPlayer extends Player {

	public RockPlayer(String name, String roshambo) {
		super(name, roshambo);
	}
	//do i need this one?
	/*public RockPlayer(){
	}*/
	
	@Override
	public String generateRoshambo() {
		setRoshambo("rock");
		return getRoshambo();
	}
	/*public void printNameAndRoshambo() {
	System.out.println(getName() + ": " + getRoshambo());
	
}*/
}
