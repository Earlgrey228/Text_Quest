package storage;

import players.*;
import rooms.*;

public class Storage {
	
	private Player p;
	private Start s;
	
	public Storage() {
		s = new Start("Начало игры");
		p = new Player(s);
	}
	
	public Player getPlayer() {
		return p;
	}
	
	public Start getStart() {
		return Start;
	}
}