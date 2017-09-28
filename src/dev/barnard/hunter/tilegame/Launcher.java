package dev.barnard.hunter.tilegame;

import dev.barnard.hunter.tilegame.display.Display;

public class Launcher {
	
	public static void main(String[]args){
		Game game = new Game("Cards!", 600, 400);
		game.start();
	}

}
