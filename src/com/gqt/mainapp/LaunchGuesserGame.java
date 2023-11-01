package com.gqt.mainapp;

import com.gqt.umpire.Umpire;

public class LaunchGuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();

	}

}
