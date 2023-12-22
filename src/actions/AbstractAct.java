package actions;

public abstract class AbstractAct {
	
	private String name;
	private String description; //описание, нужно ли?
	
	public AbstractAct(String name, String description) {
		this.name = name;
		this.description = description; //?
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	} //?
	
	public abstract void act();
	
}