package com.game.backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class loadCards {

	public static card[] compileDeck() throws FileNotFoundException {
		card[] Card = new card[98];
		Scanner cardIn = new Scanner(new File("./assets/cards.txt"));

		Card[0] = new card();
		Card[0].setCardNumber(0);
		Card[0].setCardType(999);
		Card[0].setCardValue(999);
		Card[0].setCardSpecialValue(999);
		Card[0].setCardLocation(999);
		Card[0].setCardFlavor("TEST CARD");
		
		for (int i = 1; cardIn.hasNext(); i++) {
			Card[i] = new card();
			Card[i].setCardNumber(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardType(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardValue(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardSpecialValue(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardLocation(cardIn.nextInt());
			cardIn.nextLine();
			Card[i].setCardFlavor(cardIn.nextLine());

			//System.out.println("LOADED: ");
			//Card[i].print();

		}
		cardIn.close();

		return Card;
	}

}
