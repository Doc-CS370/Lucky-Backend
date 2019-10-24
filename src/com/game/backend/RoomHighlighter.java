package com.game.backend;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RoomHighlighter extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static int pRoom[] = {0};
	private static int playerOneRoom = 0;
	private static int countClick = 0;


	RoomHighlighter() {
		JFrame map = new JFrame("My Board Game");
		map.setSize(2200, 1000);
		map.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		map.add(this);
		map.setVisible(true);
		JButton move = new JButton("Move");
		move.setBounds(15, 15, 18, 18);
		move.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				playerOneRoom++;
				pRoom[countClick] = playerOneRoom;
				repaint();
				// TODO Auto-generated method stub
				
				
				
			}
			
		});
		this.add(move);
	}
	public static void main(String[] args, int playerlocation) {
		new RoomHighlighter();

	}

	public void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;
			if (pRoom[countClick] == 0) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(470, 125, 278, 178, false);// Room 3
				g2d.draw3DRect(745, 305, 160, 110, false);// Room 1
				g2d.draw3DRect(310, 305, 160, 110, false);// Room 5
				g2d.draw3DRect(530, 380, 160, 40, false);// Room 20
				
			} else if (pRoom[countClick] == 1) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(470, 305, 270, 80, false);// Room 0
				g2d.draw3DRect(745, 270, 450, 30, false);// Room 29
				g2d.draw3DRect(745, 415, 160, 185, false);// Room 18
				g2d.draw3DRect(900, 300, 60, 190, false);// Room 30
			} else if (pRoom[countClick] == 2) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(745, 270, 450, 30, false);// Room 29
				g2d.draw3DRect(470, 125, 278, 178, false);// Room 3
			} else if (pRoom[countClick] == 3) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(745, 120, 160, 150, false);// Room 2
				g2d.draw3DRect(310, 120, 160, 150, false);// Room 4
				g2d.draw3DRect(745, 270, 450, 30, false);// Room 29
				g2d.draw3DRect(20, 270, 450, 30, false);// Room 23
				g2d.draw3DRect(470, 305, 270, 80, false);// Room 0
			} else if (pRoom[countClick] == 4) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(20, 270, 450, 30, false);// Room 23
				g2d.draw3DRect(470, 125, 278, 178, false);// Room 3
			} else if (pRoom[countClick] == 5) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(255, 300, 60, 190, false);// Room 21
				g2d.draw3DRect(20, 270, 450, 30, false);// Room 23
				g2d.draw3DRect(470, 305, 270, 80, false);// Room 0
				g2d.draw3DRect(310, 415, 160, 185, false);// Room 6
			} else if (pRoom[countClick] == 6) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(310, 305, 160, 110, false);// Room 5
				g2d.draw3DRect(20, 490, 290, 110, false);// Room 7
				g2d.draw3DRect(470, 415, 278, 185, false);// Room 19
			} else if (pRoom[countClick] == 7) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(20, 410, 235, 80, false);// Room 22
				g2d.draw3DRect(255, 300, 60, 190, false);// Room 21
			} else if (pRoom[countClick] == 8) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(20, 270, 450, 30, false);// Room 23
				g2d.draw3DRect(20, 410, 235, 80, false);// Room 22
				g2d.draw3DRect(255, 300, 60, 190, false);// Room 21
			} else if (pRoom[countClick] == 9) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(20, 20, 230, 140, false);// Room 10
				g2d.draw3DRect(20, 160, 60, 105, false);// Room 24
				g2d.draw3DRect(250, 20, 60, 140, false);// Room 25
			} else if (pRoom[countClick] == 10) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(250, 20, 60, 140, false);// Room 25
				g2d.draw3DRect(80, 160, 230, 105, false);// Room 9
				g2d.draw3DRect(20, 160, 60, 105, false);// Room 24
			} else if (pRoom[countClick] == 11) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(470, 20, 278, 65, false);// Room 12
				g2d.draw3DRect(470, 90, 278, 30, false);// Room 26
				g2d.draw3DRect(250, 20, 60, 140, false);// Room 25
			} else if (pRoom[countClick] == 12) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(745, 20, 160, 100, false);// Room 13
				g2d.draw3DRect(310, 20, 160, 100, false);// Room 11
			} else if (pRoom[countClick] == 13) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(900, 20, 60, 140, false);// Room 27
				g2d.draw3DRect(470, 90, 278, 30, false);// Room 26
				g2d.draw3DRect(470, 20, 278, 65, false);// Room 12
			} else if (pRoom[countClick] == 14) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(900, 20, 60, 140, false);// Room 27
				g2d.draw3DRect(1140, 160, 60, 105, false);// Room 28
				g2d.draw3DRect(910, 160, 230, 105, false);// Room 15
			} else if (pRoom[countClick] == 15) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(1140, 160, 60, 105, false);// Room 28
				g2d.draw3DRect(960, 20, 240, 140, false);// Room 14
				g2d.draw3DRect(900, 20, 60, 140, false);// Room 27
			} else if (pRoom[countClick] == 16) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(745, 270, 450, 30, false);// Room 29
				g2d.draw3DRect(900, 300, 60, 190, false);// Room 30
				g2d.draw3DRect(960, 410, 235, 80, false);// Room 31
			} else if (pRoom[countClick] == 17) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(745, 415, 160, 185, false);// Room 18
				g2d.draw3DRect(900, 300, 60, 190, false);// Room 30
				g2d.draw3DRect(960, 410, 235, 80, false);// Room 31
			} else if (pRoom[countClick] == 18) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(745, 305, 160, 110, false);// Room 1
				g2d.draw3DRect(470, 415, 278, 185, false);// Room 19
				g2d.draw3DRect(900, 490, 290, 110, false);// Room 17
			} else if (pRoom[countClick] == 19) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(530, 380, 160, 40, false);// Room 20
				g2d.draw3DRect(745, 415, 160, 185, false);// Room 18
				g2d.draw3DRect(310, 415, 160, 185, false);// Room 6
			} else if (pRoom[countClick] == 20) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(470, 305, 270, 80, false);// Room 0
				g2d.draw3DRect(470, 415, 278, 185, false);// Room 19
			} else if (pRoom[countClick] == 21) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(310, 305, 160, 110, false);// Room 5
				g2d.draw3DRect(20, 300, 235, 110, false);// Room 8
			} else if (pRoom[countClick] == 22) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(20, 300, 235, 110, false);// Room 8
				g2d.draw3DRect(20, 490, 290, 110, false);// Room 7
			} else if (pRoom[countClick] == 23) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(310, 120, 160, 150, false);// Room 4
				g2d.draw3DRect(310, 305, 160, 110, false);// Room 5
				g2d.draw3DRect(255, 300, 60, 190, false);// Room 21
				g2d.draw3DRect(20, 300, 235, 110, false);// Room 8
			} else if (pRoom[countClick] == 24) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(20, 20, 230, 140, false);// Room 10
				g2d.draw3DRect(80, 160, 230, 105, false);// Room 9
				g2d.draw3DRect(20, 270, 450, 30, false);// Room 23
			} else if (pRoom[countClick] == 25) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(310, 20, 160, 100, false);// Room 11
				g2d.draw3DRect(80, 160, 230, 105, false);// Room 9
				g2d.draw3DRect(20, 20, 230, 140, false);// Room 10
			} else if (pRoom[countClick] == 26) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(470, 125, 278, 178, false);// Room 3
				g2d.draw3DRect(310, 20, 160, 100, false);// Room 11
				g2d.draw3DRect(745, 20, 160, 100, false);// Room 13
			} else if (pRoom[countClick] == 27) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(910, 160, 230, 105, false);// Room 15
				g2d.draw3DRect(960, 20, 240, 140, false);// Room 14
				g2d.draw3DRect(745, 20, 160, 100, false);// Room 13
			} else if (pRoom[countClick] == 28) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(745, 270, 450, 30, false);// Room 29
				g2d.draw3DRect(910, 160, 230, 105, false);// Room 15
				g2d.draw3DRect(960, 20, 240, 140, false);// Room 14
			} else if (pRoom[countClick] == 29) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(900, 300, 60, 190, false);// Room 30
				g2d.draw3DRect(745, 120, 160, 150, false);// Room 2
				g2d.draw3DRect(745, 305, 160, 110, false);// Room 1
				g2d.draw3DRect(960, 300, 235, 110, false);// Room 16
				g2d.draw3DRect(1140, 160, 60, 105, false);// Room 28
			} else if (pRoom[countClick] == 30) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(900, 490, 290, 110, false);// Room 17
				g2d.draw3DRect(960, 300, 235, 110, false);// Room 16
				g2d.draw3DRect(745, 305, 160, 110, false);// Room 1
			} else if (pRoom[countClick] == 31) {
				g2d.setColor(Color.green);
				g2d.draw3DRect(900, 490, 290, 110, false);// Room 17
				g2d.draw3DRect(960, 300, 235, 110, false);// Room 16
			}
		
	}

	static void Highlight(int playerLocation) {

		pRoom[countClick] = playerLocation;

	}

}
