package com.game.backend;

import java.io.FileNotFoundException;
import java.util.Arrays;

public class KillDoctorLucky {

	public static void main(String[] args) {

		card[] Card = new card[98];

		try {
			Card = loadCards.compileDeck();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		room[] Room = new room[32];

		try {
			Room = loadRooms.compileMansion();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		//Room[11].print();
		//Card[96].print();
		//Card[97].print();
		//player Player = new player();
		//Card = Player.drawSevenCards(Card);
		//Card = Player.drawCard(Card);
		
		//murder check test
		player player[] = new player[9];
		
		player[0]= new player();
		player[1]= new player();
		player[2]= new player();
		player[3]= new player();
		player[4]= new player();
		player[5]= new player();
		player[6]= new player();
		player[7]= new player();
		player[8]= new player();
		
		player[0].setLocation(0);
		player[1].setLocation(6);
		player[2].setLocation(0);
		player[3].setLocation(14);
		player[4].setLocation(14);
		player[5].setLocation(14);
		player[6].setLocation(14);
		player[7].setLocation(14);
		player[8].setLocation(14);
		
		player[0].setAlive();
		player[1].setAlive();
		player[2].setAlive();
		player[3].setAlive();
		player[4].setAlive();
		player[5].setAlive();
		player[6].setAlive();
		player[7].setAlive();
		player[8].setAlive();
		
		//	int activeTurn = 1;
		//Room[0].setNumberOfOccupants(3);
		
		//boolean witnessPresent = witnessCheck.checkForWitness(Room, player, activeTurn);
		//System.out.println("RETURN " + witnessPresent);
		
		
		//Move check test
		/*
		player player[] = new player[9];
		player[1]= new player();
		player[1].setLocation(0);
		int desiredRoom = 5;
		int activeTurn = 1;
		boolean valid = moveCheck.isMoveValid(Room, player, desiredRoom, activeTurn);
		System.out.println(valid);
		*/
		
		//CARD USE CHECK
		/*
		player player[] = new player[9];
		player[1]= new player();
		player[1].testHand();
		player[1].setName("JOHNNYBOB");
		player[1].setAlive();
		Room[0].addOccupant();
		
		player[1].print();
		
		cardAbility.useRoomCard(Room, Card, player, 78, 1);
		
		player[1].print();
		*/
		

				//int playerTurn = 1;
				//int playerChoice = 0;
						
						//Move
					//	if(playerChoice == 0 ) {
							
						//	int playerLocation = player[playerTurn].getLocation();
					//		int destination = 12;
							
					//		System.out.println(moveCheck.isMoveValid(Room, player, destination, playerTurn));
					//	}
		//RoomHighlighter.main(args, playerChoice);
		//RoomHighlighter.Highlight(player[playerTurn].getLocation());
				
		//player[0].setName("JOHHNYBOB");
		//player[0].setAlive();
		//player[0].testHand();
		//player[0].print();
		//eventHandler.useRoomCard(Room, Card, player, 78, 0, 0);
		
		//player[0].print();
		
		
		
	
		
		//int value = eventHandler.useFailureCard(player, 0, Card, 1);
		//System.out.println("THE VALUE IS:" + value);
		//player[0].print();
		//Card[1].print();
		
		//Card[1].print();
		//Card[2].print();
		//Card[3].print();
		//Card[4].print();
		
		//Room[0].print();
		//Room[1].print();
		//Room[2].print();
		//Room[3].print();
		//Room[4].print();
		
		player[0].setName("JOHHNYBOB");
		player[0].setAlive();
		player[0].testHand();
		player[0].setLocation(1);
		Room[1].addOccupant();
		
		player[0].print();
		Room[1].print();
		Room[4].print();
		
		System.out.println(moveCheck.isMoveValid(Room, player, 4, 0));
		}
			
		

	}


