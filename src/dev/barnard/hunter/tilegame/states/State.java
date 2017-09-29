package dev.barnard.hunter.tilegame.states;

import java.awt.Graphics;

import dev.barnard.hunter.tilegame.Game;

public abstract class State {
	
	private static State currentState = null;
	
	public static void setState(State state){
		currentState = state;
	}
	
	public static State getState(){
		return currentState;
	}
	
	//Class
	protected Game game;
	
	public State(Game game){
		
		this.game = game;
		
	}
	
	public abstract void tick();
	 
	public abstract void render(Graphics g);
	 

}
