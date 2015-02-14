package cdsf_bullethell;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.font.effects.ColorEffect;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Menu extends BasicGameState{

	private int stateID;

	public Menu(int state){
		stateID = state;
	}

	@Override
	public void enter(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}

	@Override
	public void leave(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException{
		
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException{
		g.drawString("This is the main menu", 320, 240);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		if(gc.getInput().isKeyPressed(Input.KEY_ENTER)){
			sbg.enterState(Game.PLAY);
		}
		if(gc.getInput().isKeyPressed(Input.KEY_ESCAPE)){
			gc.exit();
		}
	}

	@Override
	public int getID(){
		return stateID;
	}
}
