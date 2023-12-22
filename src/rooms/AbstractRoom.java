package rooms;

import actions.*;
import players.*;

public abstract class AbstractRoom {
	
	//protected Storage db;
	protected String name;
	protected boolean isEntered = false; //заходили ли уже в комнату
	protected AbstractAct[] actions;
	protected Player p;
	
	public AbstractRoom(String name, /*Storage db*/Player p) {
		this.name = name;
		//this.db = db;
		this.p = p;
	}
	
	public String getName() {
		return name;
	}
	
	public abstract void play(); //метод того, что комната выводит и как играется
	
	public abstract void initActions();
	
	public void printActions() {
		for (AbstractAct a : actions) {
			System.out.println(a.getName());
		}
	}
	
	public void actionChoice(int num) {
		// todo: проверка, что ввод корректный (может быть в классе игры)
		actions[num + 1].act();
	}
}