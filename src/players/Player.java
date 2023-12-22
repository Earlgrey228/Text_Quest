package players;

import rooms.*;
import items.*;

public class Player{
	
	private String name;
	private Item [] inventory;
	private AbstractRoom room;
	private int floor;
	
	public Player(AbstractRoom room) {
		hp = 50;
		exp = 0;
		inventory = new Item[10];
		this.room = room
	}
	
	public int getHp(){
		return hp;
	}
	
	public void addHp(int hp){
		this.hp += hp;
	}
	
	public int getExp(){
		return exp;
	}
	
	public void addExp(int hp){
		this.hp += hp;
	}
	
	public Item getInventoryItem(int i){
		return inventory[i];
	}
	
	public void setInventory(int i, Item item){
		this.inventory[i] = item;
	}
	
	public void setInventory(Item [] inventory){
		this.inventory = inventory;
	}
	
	public void setRoom(AbstractRoom room){
		this.room = room;
	}
	
	public void setFloor(int floor){
		this.floor = floor;
	}
	
}