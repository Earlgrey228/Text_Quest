package game;

import players.*;
import storage.*;
import rooms.*;
import java.util.Scanner;

public class Game {
	
	private Scanner sc = new Scanner(System.in);
	private Storage db;
	
	public Game() {
		db = new Storage();
	}
	
	public void gameProcess() {
		Player p = db.getPlayer();
		//while(p.active & p.alive)  // todo: pеализовать в плэере эти методы
		while(true) {
			AbstractRoom r = p.getRoom();
			r.play();
			r.printActions();
			r.actionChoice(sc.nextInt());
		}
	}
	
}