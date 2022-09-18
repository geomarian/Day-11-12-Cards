/**
 * 
 */
package com.bridgelabz;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author ASUS
 * 
 *  Write a Program DeckOfCards.java, to initialize deck of cards having suit
("Clubs", "Diamonds", "Hearts", "Spades") & Rank ("2", "3", "4", "5", "6", "7", "8",
"9", "10", "Jack", "Queen", "King", "Ace").
 Shuffle the cards using Random method a
 nd then distribute 9 Cards to 4 Players and Print the Cards received by
the 4 Players using 2D Array...
 *
 */
public class Cards extends DeckOfCards {

	public void cardsShuffle() {
		int noOfPlayers = 4;



		String[] Suites =  {"Clubs","Diamonds","Hearts","Spades"};
		String[] Ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};




		String[][] cardsMix = new String[4][13];
		ArrayList<String> cards = new ArrayList();

		/*	
		// Player 1 getting 9 cards & so on upto 4
		for(int j = 1; j >=9; j++ ) {
			System.out.println("Player 1 has got 9 cards" + j);
		}
		//player 2 getting 9 cards 
		for(int k = 10; k >= 19; k++) {
			System.out.println("Player 2 has got 9 cards" + k);
		}
		//player 3 getting 9 cards 
		for(int m = 20; m >=29; m++) {
			System.out.println("Player 3 has got 9 cards" + m);
		}
		//player 4 getting 9 cards 
		for(int n = 30; n >= 39; n++) {
			System.out.println("Player 4 has got 9 cards " + n);
		}
		 */

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 13; j++) {
				cardsMix[i][j] = Suites[i] + Ranks[j];
			}
		}



		String[][] player = new String[4][9];
		int i ;
		int j = 0;
	
		int n = 1;
		while (n <= 36) {
			int randomSuite = (int) Math.floor(Math.random() * 10) % 4;
			int randomRanks = (int) Math.floor(Math.random() * 100) % 13;
			if(cards.add(cardsMix[randomSuite][randomRanks])) {
				if (n % 4 == 0) {
					i = 0;
					player[i][j] = cardsMix[randomSuite][randomRanks];
					j++;
				} 
			}
		}
		//Print the Player Got the Cards
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 9; j++) {
				System.out.print(player[i][j] + "  \n");
			}
			System.out.println();
		}
	}}