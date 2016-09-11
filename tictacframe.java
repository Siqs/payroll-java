//Programmer's name: Lucas Siqueira
//Course:	CPSC 223j
//Assignment number: 3
//Due date: Oct  20, 2014
//Title: Tic Tac Toe on the Web
//This file name:	tictacframe.java

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class tictacframe extends JFrame {
	private JPanel contentPane;
    private mainapplet myapplet;

	public tictacframe(mainapplet mainapp) {
		myapplet = mainapp;
		
		setTitle("Assignment 3");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 561, 577);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
        
		JLabel labelTitle = new JLabel("Tic Tac Toe by Lucas Siqueira");
		labelTitle.setFont(new Font("Tahoma", Font.PLAIN, 15));
		labelTitle.setBounds(180, 11, 348, 23);
		contentPane.add(labelTitle);

		JLabel labelSelect = new JLabel("Select starting player: ");
		labelSelect.setBounds(359, 62, 141, 14);
		contentPane.add(labelSelect);

		JButton newGameButton = new JButton("New Game");
		newGameButton.setBounds(55, 69, 100, 50);
		contentPane.add(newGameButton);

		JButton exitButton = new JButton("Exit");
		exitButton.setBounds(404, 475, 89, 49);
		contentPane.add(exitButton);
        
		ButtonGroup group = new ButtonGroup();
		
		final JRadioButton personButton = new JRadioButton("Person");
		personButton.setBounds(359, 116, 109, 23);
		contentPane.add(personButton);
		group.add(personButton);
		personButton.setSelected(true);
		
		final JRadioButton computerButton = new JRadioButton("Computer");
		computerButton.setBounds(359, 83, 109, 23);
		contentPane.add(computerButton);
		group.add(computerButton);
		
		JLabel labelDefault = new JLabel("Starting player will be X. Second player will be O.");
		labelDefault.setBounds(154, 146, 241, 14);
		contentPane.add(labelDefault);
		
		final JButton[][] button = new JButton[5][5];
		int i = 0, j = 0;
		int xCoord = 55, yCoord = 179;
		int xButtonSize = 89, yButtonSize = 55;
		
        for(i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				button[i][j]=new JButton("");
				button[i][j].setBounds(xCoord, yCoord, xButtonSize, yButtonSize);
				button[i][j].setEnabled(false);
				contentPane.add(button[i][j]);
				xCoord += 87;
			}
			xCoord = 55;
			yCoord += 55;
		}
        
		newGameButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				for(int i=0; i<5; i++)
				{
					for(int j=0; j<5; j++)
					{
						button[i][j].setText("");
					}
				}
				tictaclogic.newGame(button,computerButton, personButton);
			}
		});

		button[0][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 0, 0);
			}
		});
		
		button[0][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 0, 1);
			}
		});
		
		button[0][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 0, 2);
			}
		});
		
		button[0][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 0, 3);
			}
		});
		
		button[0][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 0, 4);
			}
		});
		
		button[1][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 1, 0);
			}
		});

		button[1][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 1, 1);
			}
		});
		
		button[1][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 1, 2);
			}
		});
		
		button[1][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 1, 3);
			}
		});
		
		button[1][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 1, 4);
			}
		});
		
		button[2][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 2, 0);
			}
		});
		
		button[2][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 2, 1);
			}
		});
		
		button[2][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 2, 2);
			}
		});
		
		button[2][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 2, 3);
			}
		});
		
		button[2][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 2, 4);
			}
		});
		
		button[3][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 3, 0);
			}
		});
		
		button[3][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 3, 1);
			}
		});
		
		button[3][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 3, 2);
			}
		});
		
		button[3][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 3, 3);
			}
		});

		button[3][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 3, 4);
			}
		});
		
		button[4][0].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 4, 0);
			}
		});
		
		button[4][1].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 4, 1);
			}
		});
		
		button[4][2].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 4, 2);
			}
		});
		
		button[4][3].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 4, 3);
			}
		});
		
		button[4][4].addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tictaclogic.play(button, 4, 4);
			}
		});
        
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				dispose();
				System.exit(0);
			}
		});
	}
}
