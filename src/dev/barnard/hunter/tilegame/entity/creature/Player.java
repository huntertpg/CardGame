package dev.barnard.hunter.tilegame.entity.creature;

import java.awt.Graphics;

import dev.barnard.hunter.tilegame.gfx.Assets;

public class Player extends Creature{

	public Player(float x, float y) {
		super(x, y);
	}

	@Override
	public void tick() {
		
	}

	@Override
	public void render(Graphics g) {
		g.drawImage(Assets.player, (int)x, (int)y, null);
	}

}
