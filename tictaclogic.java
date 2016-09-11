//Programmer's name: Lucas Siqueira
//Course:	CPSC 223j
//Assignment number: 3
//Due date: Oct  20, 2014
//Title: Tic Tac Toe on the Web
//This file name:	tictaclogic.java

import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class tictaclogic {
	static int starting;
	static int turn = 1;
	static int empty = 25;
	static boolean win = false;
	
	public static void newGame(JButton[][] button,JRadioButton btn1, JRadioButton btn2)
	{	
		int i, j;
		empty = 25;
		turn = 1;
		if(btn1.isSelected())
		{
			ComputerTurn(button);
		}
		
		for(i=0; i<5; i++)
		{
			for(j=0; j<5; j++)
			{
				button[i][j].setEnabled(true);
			}
		}
	}
	
	public static void play(JButton[][] button, int i, int j)
	{
		if(empty > 0)
		{
			if(turn == 1)
			{
				if(button[i][j].getText().equals(""))
				{
					button[i][j].setText("X");
					turn *= -1;
					empty--;

					win = checkWinner(button, i, j);
					
					if(win == true)
					{
						JOptionPane.showMessageDialog(null, button[i][j].getText()+" won the game!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
						endGame(button);
					}
					else
					{
						ComputerTurn(button);
					}
				}
			}
			else
			{
				if(button[i][j].getText().equals(""))
				{
					button[i][j].setText("O");
					turn *= -1;
					empty--;
					
					win = checkWinner(button, i, j);
					
					if(win == true)
					{
						JOptionPane.showMessageDialog(null, button[i][j].getText()+" won the game!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
						endGame(button);
					}
					else
					{
						ComputerTurn(button);
					}
				}
			}			
			
			if(empty == 0 && win == false)
			{
				JOptionPane.showMessageDialog(null, "TIE", "TIE!", JOptionPane.INFORMATION_MESSAGE);
				endGame(button);
				empty--;
			}
		}
	}
	
	public static void ComputerTurn(JButton[][] button)
	{
		int i=0, j=0;
		if(empty > 0)
		{
			Random rand = new Random();
			
			i = rand.nextInt(5);
			j = rand.nextInt(5);
			
			while(button[i][j].getText()!="")
			{		
				rand = new Random();
				i = rand.nextInt(5);
				j = rand.nextInt(5);
			}
			
			if(turn == 1)
				button[i][j].setText("X");
			else
				button[i][j].setText("O");
			
			turn*=-1;
			empty--;
			
			win = checkWinner(button, i, j);
			
			if(win == true)
			{
				JOptionPane.showMessageDialog(null, button[i][j].getText()+" won the game!", "We have a winner!", JOptionPane.INFORMATION_MESSAGE);
				endGame(button);
			}		
			if(empty == 0 && win == false)
			{
				JOptionPane.showMessageDialog(null, "TIE", "TIE!", JOptionPane.INFORMATION_MESSAGE);
				endGame(button);
				empty--;
			}
		}
	}
	
	public static boolean checkWinner(JButton[][] button, int i, int j)
	{
		boolean win = false;
		win = checkLines(button, i, j) || checkColumm(button, i, j) || checkDiagonal(button, i, j);
		return win;
	}
	
	public static boolean checkLines(JButton[][] button, int i, int j)
	{
		String currentPlayer;
		
		currentPlayer = button[i][j].getText();
		
		if(button[0][j].getText().equals(currentPlayer) && button[1][j].getText().equals(currentPlayer) 
		&& button[2][j].getText().equals(currentPlayer) && button[3][j].getText().equals(currentPlayer) 
		&& button[4][j].getText().equals(currentPlayer))
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkColumm(JButton[][] button, int i, int j)
	{
		String currentPlayer;
		currentPlayer = button[i][j].getText();
		
		if(button[i][0].getText().equals(currentPlayer) && button[i][1].getText().equals(currentPlayer) 
		&& button[i][2].getText().equals(currentPlayer) && button[i][3].getText().equals(currentPlayer) 
		&& button[i][4].getText().equals(currentPlayer))
		{
			return true;
		}
		return false;
	}
	
	public static boolean checkDiagonal(JButton[][] button, int i, int j)
	{
		String currentPlayer;
		currentPlayer = button[i][j].getText();
		
		if(button[0][0].getText().equals(currentPlayer) && button[1][1].getText().equals(currentPlayer) 
		&& button[2][2].getText().equals(currentPlayer) && button[3][3].getText().equals(currentPlayer) 
		&& button[4][4].getText().equals(currentPlayer))
		{
			return true;
		}
		if(button[4][0].getText().equals(currentPlayer) && button[3][1].getText().equals(currentPlayer) 
		&& button[2][2].getText().equals(currentPlayer) && button[1][3].getText().equals(currentPlayer) 
		&& button[0][4].getText().equals(currentPlayer))
		{
			return true;
		}
		return false;
	}
	
	public static void endGame(JButton[][] button)
	{	int i, j;
	
		for(i = 0; i<5; i++)
		{
			for(j = 0; j<5; j++)
			{
				button[i][j].setEnabled(false);
			}
		}
	}
}
