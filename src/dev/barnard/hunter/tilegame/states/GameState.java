package dev.barnard.hunter.tilegame.states;

import java.awt.Graphics;

import dev.barnard.hunter.tilegame.Handler;
import dev.barnard.hunter.tilegame.entity.creature.Player;
import dev.barnard.hunter.tilegame.world.World;

public class GameState extends State{

	private Player player;
	private World world;
	
	public GameState(Handler handler){
		super(handler);
		world = new World(handler, "/assets/worlds/world1.txt");
		handler.setWorld(world);
		player = new Player(handler, 100,100);
	
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
