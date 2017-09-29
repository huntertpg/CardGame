package dev.barnard.hunter.tilegame.tiles;

import java.awt.image.BufferedImage;

import dev.barnard.hunter.tilegame.gfx.Assets;

public class LavaTile extends Tile{

	public LavaTile(int id) {
		super(Assets.lava, id);
	}

	@Override
	public boolean isSolid(){
		return false;
	}
	
}
