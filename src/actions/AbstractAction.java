package actions;

public class AbstractAction {
	
	private String name;
	private String description; //описание, нужно ли?
	
	public AbstractAction(String name; String description) {
		this.name = name;
		this.description = description; //?
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description
	} //?
	
	public void act();
}