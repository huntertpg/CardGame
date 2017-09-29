package dev.barnard.hunter.tilegame.gfx;

import java.awt.image.BufferedImage;

public class Assets {

	private static final int width = 570, height = 600;
	private static final int width2 = 32, height2 = 32;

	public static BufferedImage card1, card2, card3, player, stone, grass;
	
	public static void init(){
		
		SpriteSheet sheet = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet.png"));
		SpriteSheet sheet1 = new SpriteSheet(ImageLoader.loadImage("/textures/SpriteSheet2.png"));

		card1 = sheet.crop(0, 0, width, height);
		card2 = sheet.crop(width, 0, width, height);
		card3 = sheet.crop(width*2, 0, width, height);

		player = sheet1.crop(0, 0, width2, height2);
		grass = sheet1.crop(width2, 0, width2, height2);
		stone = sheet1.crop(width2*2, 0, width2, height2);
	}
	
}
