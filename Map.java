public class Map{
	
	private String floor;
	
	public void setFloor(String floor){
		this.floor = floor;
	}
	
	public void getMap(String floor){
		if (floor.equals("up")){
		System.out.println(" ___________" + " __________" + "___________" + "__________ " + "__________ " + "\n" + 
						   "|           |" + "          " + "       |   " + "          |" + " лестница |" + "\n" +
						   "|           |" + "          " + "       |   " + "          |" + "     в    |" + "\n" +
						   "|           |" + "       кух" + "ня     |   " + "туалет    |" + "  подвал  |" + "\n" +
						   "|           |" + "          " + "       |   " + "          |" + "     |    |" + "\n" +
						   "|____<!>____|" + "_______   " + "_______|___" + "__  ______|" + "_____V____|" + "\n" + 
						   "|           |" + "          " + "  ? |???|  " + "          |" + " |_       |" + "\n" +
						   "| начальная |" + "          " + "    |___|  " + "          |" + "   |_     |" + "\n" +
						   "|  комната   " + "          " + "           " + "          +" + "     |_   |" + "\n" +
						   "|           |" + "          " + "           " + "          |" + "       |__|" + "\n" +
						   "|____<!>____|" + "__________" + "____++++___" + "__________|" + "__________|" + "\n" +
						   "|           |" + "          " + "           " + "          |" + "     ^    |" + "\n" +
						   "|           |" + "          " + "           " + "          |" + "     |    |" + "\n" +
						   "|           |" + "          " + "   офис    " + "          |" + "подвальная|" + "\n" +
						   "|           |" + "          " + "           " + "          |" + " лестница |" + "\n" +
						   "|___________|" + "__________" + "___????____" + "__________|" + "__________|" + "\n");  
		} else {
		System.out.println(" ____________" + "__________" + "___________" + "___________" + "__________ " + "\n" +
						   "|           |" + "          " + "       |   " + "           " + "          |" + "\n" +
						   "|           |" + "    комнат" + "а      |   " + "           " + "          |" + "\n" +
						   "|           |" + "    ученог" + "о      |   " + "           " + "          |" + "\n" +
						   "|           |" + " (or вол" + "шебника) |   " + "           " + "          |" + "\n" +
						   "|___________|" + "_______   " + "_______|   " + "           " + "          |" + "\n" +
						   "| |_        |" + "          " + "       |   " + "           " + "          |" + "\n" +
						   "|   |_      |" + "          " + "       6   " + "    ТАNНСТВ" + "ЕННАЯ     |" + "\n" +
						   "|     |_     " + "          " + "       6   " + "      ЗЛОВЕ" + "ЩАЯ       |" + "\n" +
						   "|       |___|" + "          " + "       6   " + "       КОМА" + "АТА       |" + "\n" +
						   "|___________|" + "_______   " + "_______|   " + "           " + "          |" + "\n" +
						   "|           |" + "          " + "       |   " + "           " + "          |" + "\n" +
						   "|           |" + "    комнат" + "а      |   " + "           " + "          |" + "\n" +
						   "|           |" + "       с  " + "       |   " + "           " + "          |" + "\n" +
						   "|           |" + "     лампо" + "й      |   " + "           " + "          |" + "\n" +
						   "|___________|" + "__________" + "_______|___" + "___________" + "__________|" + "\n");
		}
	}
	
}