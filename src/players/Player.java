package player;

import rooms.*;
import items.*;

public class Player{
	
	private int hp = 50;
	private int exp = 0;
	private String name;
	private Item [] inventory = new Item[10];
	private AbstractRoom room;
	private int floor;
	
	public Player(String name){
		this.name = name;
	}
	
	public int getHp(){
		return hp;
	}
	
	public void setHp(int hp){
		this.hp = hp;
	}
	
	public int getExp(){
		return exp;
	}
	
	public void setExp(int hp){
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