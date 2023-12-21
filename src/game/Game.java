package game;

public class Game {
	
	Scanner sc = new Scanner(System.in);
	
	public void start() {
	}
	
	public void gameProcess() {
		while(p.active & p.alive) {
			Room r = p.getRoom();
			r.play();
			r.printActions();
			r.actionChoise(sc.nextInt());
		}
	}
	
	public void end() {}
}