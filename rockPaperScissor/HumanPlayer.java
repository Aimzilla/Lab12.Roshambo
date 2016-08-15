package rockPaperScissor;

import java.util.Scanner;

public class HumanPlayer extends Player {
	
	public HumanPlayer(String name, String roshambo) {
		super(name, roshambo);
	}
	
	//do I need this one?
	/*public HumanPlayer(){
	}*/
	
	@Override
	public String generateRoshambo() {
		return null;
	}

}
