package actions;

import rooms.*;

public class ActChangeRoom extends AbstractAct{
	
	private AbstractRoom room;
	
	public ActChangeRoom(String name, String description, AbstractRoom room) {
		super(name, description);
		this.room = room;
	}
	
	public void act(Player p) {
		p.setRoom(room);
	}
}