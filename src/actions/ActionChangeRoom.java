package actions;

import rooms.*;

public class ActionChangeRoom extends AbstractAction{
	
	private AbstractRoom room;
	
	public ActionChangeRoom(String name, String description, AbstractRoom room) {
		super(name, description);
		this.room = room;
	}
	
	public void act(Player p) {
		p.setRoom(room);
	}
}