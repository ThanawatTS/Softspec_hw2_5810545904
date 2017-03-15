package ui;

import java.util.Scanner;


import game.Game;

public class Terminal {

	private Game game;
	private Scanner scanner;
	

	public void run() {
		// TODO: Write all game logic in here.
		// If you do it correctly, you don't need to add new
		// functions into other classes.
		Scanner sc = new Scanner(System.in);
		game = new Game();
		game.start();
		int row,col;
		int gam = 0;
		while(!game.isEnd()){
			
			if(game.isP1Turn()){
				game.getCurrentPlayerName();
			}
			else{
				game.getCurrentPlayerName();
			}
			
			System.out.println(game.getCurrentPlayerName());
			System.out.print("Input row: ");
			row = sc.nextInt();
			System.out.print("Input col: ");
			col = sc.nextInt();
			
			game.currentPlayerTakesAction(row, col);
			renderBoard(game);
			
		}
		
		System.out.println(game.getWinnerName()+ " Win!");
		
	}

	private void renderBoard(Game game) {
		int size = game.getBoardSize();
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				String s = game.getSymbolOnBoard(row, col);
				if(s == null) {
					s = "_";
				}
				System.out.print(s);
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Terminal ui = new Terminal();
		ui.run();
	}

}
