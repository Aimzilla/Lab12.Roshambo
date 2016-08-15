package myAppRosh;

import java.util.Scanner;

import rockPaperScissor.HumanPlayer;
import rockPaperScissor.Player;
import rockPaperScissor.RandomPlayer;
import rockPaperScissor.RockPlayer;

public class MyApp {

	public static void main(String[] args) {
		Scanner scan1 = new Scanner(System.in);

		String name = "";
		String opponentName = "";
		String roshambo = "";
		String choice = "y";

		Player Human = new HumanPlayer(name, roshambo);
		Player Thelma = new RockPlayer(name, roshambo);
		Player Louise = new RandomPlayer(name, roshambo);

		System.out.println("Welcome to Rock, Paper, Scissors!!");
		System.out.println();
		System.out.print("Please enter your name: ");
		Human.setName(scan1.nextLine());

		// enter while/continue template
		while (choice.equalsIgnoreCase("y")) {

			System.out.print("Would you like to play against Thelma or Louise? ");
			// Thelma = RockPlayer, Louise = RandomPlayer
			opponentName = scan1.nextLine();

			System.out.print("Select your play: Rock, Paper, or Scissors? ");
			Human.setRoshambo(scan1.nextLine()); 
			// print user's (human player) name & their selection:
			Human.printNameAndChoice();

			while (opponentName.equalsIgnoreCase("Thelma")) {
				Thelma.setName("Thelma");
				Thelma.setRoshambo("rock");
				Thelma.getRoshambo();
				Thelma.printNameAndChoice();// this doesn't seem to be working

				if (Human.getRoshambo().equalsIgnoreCase("Rock")) {
					System.out.println("Tie!");
				}
				if (Human.getRoshambo().equalsIgnoreCase("Paper")) {
					System.out.println(Human.getName() + " wins!");
				}
				if (Human.getRoshambo().equalsIgnoreCase("Scissors")) {
					System.out.println(Thelma.getName() + " wins!");
				}
				opponentName = "x";
			}
			while (opponentName.equalsIgnoreCase("Louise")) {
				Louise.setName("Louise");
				Louise.generateRoshambo();
				String result = Louise.getRoshambo();//need to pull in random result
				Louise.printNameAndChoice();

				if (Human.getRoshambo().equalsIgnoreCase(result)) {
					System.out.println("Tie!");
				} else {
					//System.out.println("False");
				}

				humanPlayerRock(Human, Louise);

				humanPlayerPaper(Human, Louise);

				humanPlayerScissors(Human, Louise);
				
				opponentName = "x";
				
				//need to move this to the right location...
				System.out.println("Would you like to play again? (y/n)");
				choice = scan1.nextLine();
				
			}
		}
	}

	public static void humanPlayerScissors(Player Human, Player Louise) {//compare results of human & random
		if (Human.getRoshambo().equalsIgnoreCase("scissors")) {
			if (Louise.getRoshambo().equalsIgnoreCase("paper")) {
				System.out.println(Human.getName() + " has won!");
			}

			if (Louise.getRoshambo().equalsIgnoreCase("rock")) {
				System.out.println(Louise.getName() + " has won!");

			}

		}
	}

	public static void humanPlayerPaper(Player Human, Player Louise) {
		if (Human.getRoshambo().equalsIgnoreCase("paper")) {

			if (Louise.getRoshambo().equalsIgnoreCase("scissors")) {
				System.out.println(Louise.getName() + " has won!");
			}
			if (Louise.getRoshambo().equalsIgnoreCase("rock")) {
				System.out.println(Human.getName() + " has won!");
			}
		}
	}

	public static void humanPlayerRock(Player Human, Player Louise) {
		if (Human.getRoshambo().equalsIgnoreCase("rock")) {
			if (Louise.getRoshambo().equalsIgnoreCase("paper")) {
				System.out.println(Louise.getName() + " has won!");
			}
			if (Louise.getRoshambo().equalsIgnoreCase("scissors")) {
				System.out.println(Human.getName() + " has won!");
			}

		}
		
	}
	
}

