package com.in28minutes.learnspringframework.game;

public class GameRunner {
	private SuperContraGame game; // Tightly coupled. The game runner class would have to make changes  
	
	public GameRunner(SuperContraGame game) {
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
