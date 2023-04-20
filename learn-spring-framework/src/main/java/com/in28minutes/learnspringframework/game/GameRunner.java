package com.in28minutes.learnspringframework.game;

public class GameRunner {
	private GamingConsole game; // Tightly coupled. The game runner class would have to make changes  
	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}

	public void run() {
		System.out.println("Running game: " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
}
