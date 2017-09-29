package dev.barnard.hunter.tilegame.states;

import java.awt.Graphics;

import dev.barnard.hunter.tilegame.Game;
import dev.barnard.hunter.tilegame.entity.creature.Player;
import dev.barnard.hunter.tilegame.world.World;

public class GameState extends State{

	private Player player;
	private World world;
	
	public GameState(Game game){
		super(game);
		player = new Player(game, 100,100);
		world = new World("/assets/worlds/world1.txt");
	}
	
	@Override
	public void tick() {
		world.tick();
		player.tick();
	}

	@Override
	public void render(Graphics g) {
		world.render(g);
		player.render(g);

	}

	
	
}
