package game;

import players.*;

public class Game {
	
	private Storage db;
	
	public Game() {
		db = new Storage();
	}
	
	public void gameProcess() {
		Player p = db.getPlayer();
		while(p.active & p.alive) { // todo: pеализовать в плэере эти методы
			AbstractRoom r = p.getRoom();
			r.play();
			r.printActions();
			r.actionChoise(sc.nextInt());
		}
	}
	
}