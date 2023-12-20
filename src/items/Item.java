package items;

public class Item{
	
	private String name;
	private String descriptoin;
	
	public Item(String name, String descriptoin){
		this.name = name;
		this.descriptoin = descriptoin;
	}
	
	public String getName(){
		return name;
	}
	
	public void readDecription(){
		System.out.println(descriptoin);
	}
	
}