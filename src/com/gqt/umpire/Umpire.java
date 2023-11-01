package com.gqt.umpire;

import com.gqt.guesser.Guesser;
import com.gqt.player.Player;

public class Umpire {
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	public void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNum();
		
	}
	public void collectNumFromPlayers() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numFromPlayer1 = p1.guessNum();
		numFromPlayer2 = p2.guessNum();
		numFromPlayer3 = p3.guessNum();
		
	}
	
	public void compare() {
		System.out.println("Guesser number is "+numFromGuesser);
		if(numFromGuesser == numFromPlayer1) {
			System.out.println("Player1 wins");
		}
		 if(numFromGuesser == numFromPlayer2) {
			System.out.println("Player2 wins");
		}
		 if(numFromGuesser == numFromPlayer3) {
			System.out.println("Player3 wins");
		}
		if(numFromGuesser != numFromPlayer1 && numFromGuesser != numFromPlayer2
				&& numFromGuesser != numFromPlayer3) {
			System.out.println("Game lost..Try again");
		}
	}

}
