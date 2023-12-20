package rooms;

import actions.*;

public abstract class AbstractRoom {
	
	protected String name;
	protected boolean isEntered; //заходили ли уже в комнату
	protected Action[] actions;
	
	public AbstractRoom(String name) {
		isEnteres = false;
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void play(); //метод того, что комната выводит и как играется
	
	public void printActions() {
		for (Action a : actions) {
			System.out.println(a);
		}
	}
	
	public void actionChoice(int num) {
		// todo: проверка, что ввод корректный (может быть в классе игры)
		actions[num + 1].act();
	}
}