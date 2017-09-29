package dev.barnard.hunter.tilegame.states;

import java.awt.Graphics;

import dev.barnard.hunter.tilegame.Game;
import dev.barnard.hunter.tilegame.entity.creature.Player;

public class GameState extends State{

	private Player player;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100,100);
	}
	
	@Override
	public void tick() {
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		player.render(g);
	}

	
	
}
