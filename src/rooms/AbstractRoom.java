package rooms;

import actions.*;

public abstract class AbstractRoom {
	
	protected Storage db;
	protected String name;
	protected boolean isEntered = false; //заходили ли уже в комнату
	protected Action[] actions;
	protected Player p;
	
	public AbstractRoom(String name, Storage db, Player p) {
		this.name = name;
		this.db = db;
		this.p = p;
	}
	
	public String getName() {
		return name;
	}
	
	public void play(); //метод того, что комната выводит и как играется
	
	public void printActions() {
		for (Action a : actions) {
			System.out.println(a.getName());
		}
	}
	
	public void actionChoice(int num) {
		// todo: проверка, что ввод корректный (может быть в классе игры)
		actions[num + 1].act();
	}
}