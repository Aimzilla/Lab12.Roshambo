package rockPaperScissor;

import java.util.Random;

public class RandomPlayer extends Player {
	
	public RandomPlayer(String name, String roshambo) {
		super(name, roshambo);
	}
	//do I need this one?
	/*public RandomPlayer(){
	}*/
	
	@Override
	//unsure which approach is better...
	/*public String generateRoshambo() {
		// need to generate a random selection of rock/paper/scissors & have the
		// method return the random value
		String[] s = { "rock", "paper", "scissors" };
		Random rand = new Random();
		String s_rand = s[rand.nextInt(s.length)];

		// return random result here:
		return s_rand;

	}*/
	
	public String generateRoshambo() {
		Random rand = new Random();
		int value = rand.nextInt(3);
		if (value == 2){
			setRoshambo("rock");
		}if (value == 1){
			setRoshambo("paper");
		}if (value == 0){
			setRoshambo("scissors");
		}
		
		return getRoshambo();
	}
	/*public void printNameAndRoshambo() {
		System.out.println(getName() + ": " + generateRoshambo());
}*/
}
