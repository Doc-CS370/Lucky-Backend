package com.game.backend;

import java.io.*;
import java.util.*;
public class save {

		
		public static void exportVariables(room[] room, player[] player, card[] card) {
			int filenumber;
			String filename =null;
			Scanner input = new Scanner(System.in);	
			//asks user to name the save file
			
			System.out.println("Please choose the save file (input number 1-9)");
			

			
			filenumber = 1; //input.nextInt();		//FOR SOME REASON, this seems to be broken
			
			
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
			
			try {
				FileWriter writer = new FileWriter(filename);
				BufferedWriter buffer = new BufferedWriter(writer);
				
				// dr. Lucky
				buffer.write(player[0].getName());
				buffer.newLine();
				buffer.write(String.valueOf(player[0].getStatus()));
				buffer.newLine();
				buffer.write(String.valueOf(player[0].getLocation()));
				buffer.newLine();
				//Players
				for (int i = 1; i < 8 ; i++) {
					buffer.write(player[i].getName());									//name
					buffer.newLine();
					buffer.write(String.valueOf(player[i].getStatus()));				//status
					buffer.newLine();
					buffer.write(String.valueOf(player[i].getLocation()));								//location
					buffer.newLine();
					buffer.write(String.valueOf(player[i].getHandIndex()));				//hand index
					buffer.newLine();
					for (int n = 0; n< player[i].getHandIndex(); n++) {
						buffer.write(String.valueOf(player[i].getPlayerCard(n))); 		//hand	
						buffer.newLine();
					}
					buffer.write(String.valueOf(player[i].getSpite()));									//spite
					buffer.newLine();
					buffer.write(String.valueOf(player[i].getTurnsLeft()));
					buffer.newLine();
				}
				//Room Generation
				
				//Rooms
				for (int x = 0; x < 32; x++) {
					buffer.write(String.valueOf(room[x].getNumberOfOccupants()));
					buffer.newLine();
				}
				//Cards Generation
				
				//Cards
				for (int z = 1; z < 99; z++) {
					buffer.write(String.valueOf(card[z].getCardStatus()));
					buffer.newLine();
				}
				
				
				buffer.close();
				input.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
}
