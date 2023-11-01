package com.gqt.player;

import java.util.Scanner;

public class Player {
int pnum;
	
	public int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player, kindly guess the number");
		pnum = scan.nextInt();
		return pnum;
	}

}
