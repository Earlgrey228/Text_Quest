package rooms;

import actions.*;
import players.*;
import Log.*;
import java.util.Scanner;

public class PreIntermedia1301 extends AbstractRoom{
	
	Scanner sc = new Scanner(System.in);
	
	public PreIntermedia1301(String name, Player p){
		super(name,p);
	}
	
	public void initActions(Storage db){
		
		actions = new AbstractAct[3];
		actions[0] = new ActDeath("в тумбу", "Существо схватило вас за ногу, от страха вы потеряли сознание, а дальше…");
		actions[1] = new ActDeath("Обратно на улицу", "Вы ринулись к выходу, но Существо своим мощным хвостом снесло вас с ног. От сильнейшего удара головой…");
		actions[2] = new ActChangeRoom("в дверь налеве", "Вы забежали в комнату, и как только ваши глаза увидели шкаф, ваше тело ринулось в него. От страха вы потеряли сознание…", db.getMainRoom());
	}
	
	public void play(){
		Log.out("Наши герои пришли к этому дому сквозь чащу леса. Подойдя к двери, они достали топор и выломали её. Но внутри него их что-то встретило…");
		Log.out("Тёмное, злое существо зарычало… и накинулось на вас! Вы и друзья в панике побежали в рассыпную");
	}
	
}