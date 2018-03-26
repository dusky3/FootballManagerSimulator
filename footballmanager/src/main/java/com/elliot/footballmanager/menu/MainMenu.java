package com.elliot.footballmanager.menu;

import java.util.Scanner;

import com.elliot.footballmanager.gamemanager.GameManager;

/**
 * @author Elliot
 * Once a user has loaded / created a save game the MainMenu class provides 
 * the list of options available throughout the FootballManager simulator.
 */
public class MainMenu {

	private static Scanner scanner  = new Scanner(System.in);
	private GameManager gameManager;
	
	public MainMenu() {
		
	}

	public MainMenu(GameManager gameManager) {
		this.gameManager = gameManager;
		
		beginMainGameLoop();
	}
	
	/**
	 * The main loop used to play the game and display the different
	 * pieces of information required.
	 * The options provided are: 
	 * [0] : Save and quit
	 * [1] : View next football match options 
	 * [2] : View football team options
	 * [3] : View quick information information
	 */
	private void beginMainGameLoop() {
		MenuHelper.clearConsole();
		
		System.out.println("Press 0 at any point to save the game and quit!");
		displayMainGameOptions();
		
		boolean quit = false;
		do {	
			switch (scanner.nextInt()) {
				case 0:
					this.getGameManager().saveGame();
					quit = true;
				case 1:
					break;
				case 2:
					break;
				case 3: 
					break;	
			}
		} while (!quit);
	}
	
	private void displayMainGameOptions() {
		System.out.println("[1] View next football match options");
		System.out.println("[2] View football team options");
		//TODO: Print a current timestamp of the date in which the simulation is in option 3
		// (E.g. 01/01/2020 | Current Team  | League Position)
		System.out.println("[3] View quick information information");		
	}
	
	private void displayNextFootballMatchOptions() {
			
	}

	public GameManager getGameManager() {
		return gameManager;
	}
}