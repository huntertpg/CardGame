package dev.barnard.hunter.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 570, height = 600;
	
	public static BufferedImage card1, card2, card3;
	
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet.png"));
		
		card1 = sheet.crop(0, 0, width, height);
		card2 = sheet.crop(width, 0, width, height);
		card3 = sheet.crop(width*2, 0, width, height);
		
	}
	
}
