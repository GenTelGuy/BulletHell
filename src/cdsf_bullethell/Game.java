package cdsf_bullethell;

import org.newdawn.slick.*;
import org.newdawn.slick.state.*;

public class Game extends StateBasedGame{

	public static final String gameName = "Bullet Hell";
	public static final int MENU = 0;
	public static final int PLAY = 1;
	public static final int SCREEN_WIDTH = 640;
	public static final int SCREEN_HEIGHT = 480;

	public Game(String gameName){
		super(gameName);
		
		this.addState(new Menu(MENU));
		this.addState(new Play(PLAY));
	}

	public void initStatesList(GameContainer gc) throws SlickException{
		this.getState(MENU).init(gc, this);
		this.getState(PLAY).init(gc, this);
		this.enterState(MENU);
	}

	public static void main(String[] args){
		AppGameContainer appgc;
		try{
			appgc = new AppGameContainer(new Game(gameName));
			appgc.setDisplayMode(SCREEN_WIDTH, SCREEN_HEIGHT, false);
			appgc.setTargetFrameRate(60);
			appgc.setShowFPS(false);
			appgc.setVSync(true);
			appgc.start();
		}catch(SlickException e){
			e.printStackTrace();

		}

	}
}

