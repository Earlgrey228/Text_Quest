public class Player{
	
	private int hp;
	private int exp;
	private String name;
	private Item [] inventory;
	private AbstractRoom room;
	private String floor;
	
	public Player(String name, int hp, int exp){
		this.name = name;
		this.hp = hp;
		this.exp = exp;
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
	
	public void setFloor(String floor){
		this.floor = floor;
	}
}