package com.game.backend;

import java.util.Scanner;
import java.io.*;
public class load {

	
	public static void importVariables(room[] room, player[] player, card[] card) throws FileNotFoundException {
		int filenumber;
		String filename = null;
		Scanner input = new Scanner(System.in);
		
		//asks user for name of file to be loaded
		System.out.println("Please select savefile (input number 1-9)");
		
		filenumber= 1; //input.nextInt();
		
		switch (filenumber) {
		case 1: 			filename = "KDR_Save1.txt";
							break;
		case 2: 			filename = "KDR_Save2.txt";
							break;		
		case 3: 			filename = "KDR_Save3.txt";
							break;
		case 4: 			filename = "KDR_Save4.txt";
							break;
		case 5: 			filename = "KDR_Save5.txt";
							break;
		case 6: 			filename = "KDR_Save6.txt";
							break;
		case 7: 			filename = "KDR_Save7.txt";
							break;
		case 8: 			filename = "KDR_Save8.txt";
							break;
		case 9: 			filename = "KDR_Save9.txt";
							break;
		default: 			System.out.println("Invalid Save File");		//ERROR
		}
		
		
		File file = new File (filename);
		Scanner loader = new Scanner(file);
		
		//Doctor Lucky
		player[0].setName(loader.nextLine());
		player[0].setStatus(Boolean.valueOf(loader.nextLine()));
		player[0].setLocation(Integer.valueOf(loader.nextLine()));
		//Players
		for (int i=1; i <= 7; i++) {
			player[i].setName(loader.nextLine());								//name
			player[i].setStatus(Boolean.valueOf(loader.nextLine()));			//status
			player[i].setLocation(Integer.valueOf(loader.nextLine()));			//location
			int handSize = Integer.valueOf(loader.nextLine());					//hand Index
			for (int n = 0; n < handSize; n++) {								//card hand 
				player[i].addCard(Integer.valueOf(loader.nextLine()));
			}
			player[i].setSpite(Integer.valueOf(loader.nextLine()));				//spite	
			player[i].setTurns(Integer.valueOf(loader.nextLine()));			//moves left
		}
		//Rooms Generation
													//generates mansion
		//Rooms
		for (int x=0; x >=31; x++) {											//occupants of rooms
			room[x].setNumberOfOccupants(Integer.valueOf(loader.nextLine()));
		}
		//Cards Generation
														//generates cards
		//Cards
		for (int z=0; z >= 99; z++) {											//status of cards
			card[z].setCardStatus(Integer.valueOf(loader.nextLine()));	
		}
		input.close();
		loader.close();
	}
		
}
