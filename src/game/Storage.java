package game;

import players.*;
import game.*;

public class Storage {
	
	private Player p;
	private Start s;
	
	public Storage() {
		p = new Player();
		s = new Start("Начало игры");
	}
	
	public Player getPlayer() {
		return p;
	}
	
	public Start getStart() {
		return Start;
	}
}