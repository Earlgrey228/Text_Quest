package actions;

import players.*;

public class ActDeath extends AbstractAct{
	
	public ActDeath(String name, String description){
		super(name, description);
	}
	
	public void act(Player p){
		p.setHp(0);
	}
	
}