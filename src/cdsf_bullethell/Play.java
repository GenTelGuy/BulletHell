package cdsf_bullethell;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class Play extends BasicGameState{

	private int stateID;

	public Play(int state){
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
		g.drawString("This is the play state", 320, 240);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException{
		if(gc.getInput().isKeyPressed(Input.KEY_ESCAPE)){
			sbg.enterState(Game.MENU);
		}
	}

	@Override
	public int getID(){
		return stateID;
	}
}
