package com.gqt.guesser;

import java.util.Random;
import java.util.Scanner;

public class Guesser {
	int gnum;
	
	public int guessNum() {
		System.out.println("Guesser, kindly guess the number");
		Scanner scan = new Scanner(System.in);
		gnum = scan.nextInt();
		return gnum;
	}

}
