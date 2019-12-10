package com.game.backend;

import java.util.Arrays;

public class player{

	int[] playerHand = new int[10];
	int handIndex = 0; //SHOULD ALWAYS BE LOCATED ON A NULL CARD VALUE
	int spiteTokens = 0;
	int playerLocation = 0;
	int turnsLeft = 0;
	String name;
	boolean isAlive = false;

	
	
	public int[] getPlayerHand() {
		return playerHand;
	}
	public void setPlayerHand(int[] cardHand) {
		playerHand = cardHand;
	}
	
	public int getPlayerCard(int cardNumber) {
		return playerHand[cardNumber];
	}
	public void setAlive() {
		isAlive = true;

	}
	public void setStatus(boolean status) {
		isAlive = status;
	}
	public boolean getStatus() {

		return isAlive;
	}

	public void setName(String newName) {

		name = newName;
	}

	public String getName() {

		return name;
	}

	public void setLocation(int newVal) {

		playerLocation = newVal;
	}

	public int getLocation() {

		return playerLocation;
	}
	
	public void addSpite() {
		spiteTokens= spiteTokens+1;
	}
	
	public void setSpite(int spite) {
		spiteTokens = spite;
	}
	public int getSpite() {
		return spiteTokens;
	}
	
	public void endTurn() {

		turnsLeft--;
	}

	public int getTurnsLeft() {

		return turnsLeft;
	}

	public void addTurns(int val) {

		turnsLeft = turnsLeft + val;

	}
	
	public void setTurns(int turns) {
		turnsLeft = turns;
	}
	public void addHandIndex() {
		
		handIndex++;
	}
	
	public void decHandIndex() {
		
		handIndex--;
	}
	
	public int getHandIndex() {
		return handIndex;
	}
	public void setHandIndex(int index) {
		handIndex = index;
	}
	public void addCard(int cardNum) {
		playerHand[handIndex] = cardNum;
		handIndex++;
		
	}
	
	public void removeCard(int cardNum) {
		
		for (int i = 0; i < 10; i++) {
			if(playerHand[i] == cardNum) {
				int mark = i;
				while(mark < 9) {
					playerHand[mark] = playerHand[mark+1];
					mark++;
				}
				playerHand[9] = 0;
				handIndex--;
				i = 10;
			}
			
			
		}
		
	}
	
	public void testHand() {
		
		//THIS IS JUST TO FORCE CARDS INTO SOMEONES HAND
		playerHand[0] = 78;
		playerHand[1] = 79;
		handIndex = 2;
	}
	public void print() {
		System.out.println("/////////////////////////////////////////////////");
		System.out.println("CURRENT PLAYER IS: " + name + " IS " + isAlive);
		System.out.println("HOLDING CARDS: " + Arrays.toString(playerHand));
		System.out.println("WITH AN INDEX OF: " + handIndex);
		System.out.println("WITH " + spiteTokens + " SPITE TOKENS");
		System.out.println("CURRENTLY IN ROOM: " + playerLocation);
		System.out.println("WITH " + turnsLeft + " TURNS LEFT");
		System.out.println("/////////////////////////////////////////////////");
		
	}
}
