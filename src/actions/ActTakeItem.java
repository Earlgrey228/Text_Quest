package actions;

import items.*;
import players.*;

public class ActTakeItem extends AbstractAct{
	
	public ActTakeItem(String name, String description){
		super(name, description);
	}
	
	public void act(Player p, Item item, int index){
		p.setInventory(index, item);
	}
	
}