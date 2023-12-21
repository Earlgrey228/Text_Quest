package game;

import rooms.*;
import log.*;
import actions.*;

public class Start extends AbstractRoom{
	
	private Scanner sc = new Scanner(System.in);
	
	public Start(String name) {
		super(name);
		this.initActions();
	}
	
	public void initActions() {
		actions = new AbstractAct[2];
		actions[1] = ActExit("Нет, я трусливо ухожу", "Очень жаль, о, странник! Что ж, в таком случае, прощай!");
		actions[0] = ActChangeRoom("Да! Начинаем игру!", "Я очень рад! Что ж, отправляемся скорей!", db.getOutsideRoom); // момент с бд нужно исправить
	}
	
	public void play(Player p) {
		Log.out("Добро пожаловать в наш текстовый квест, странник!");
		Log.out("Как тебя зовут?");
		p.setName(sc.nextLine);
		Log.out("\tВ тихом городке Балтач, на окраине, есть древний домик, где когда-то давным-давно жил и работал болгарский учёный.\n"+
			"По легенде, он работал с различными сущностями и искал способ найти контакт с джинном. И он смог найти этот контакт,\n" +
			"что обернулось для него страшной трагедией…\n "
			"\tС тех пор никто из людей не знает, куда делся тот учёный. Да и вообще, это было так давно, что достоверно неизвестно,\n" +
			"чем учёный на самом деле занимался, существовал ли он в действительности.\n"
			"Однако легенда жива, а люди обходят стороной тот дом и по сей день.\n" 
			"\tНе все, всё же, верят в сказки. И наша компания друзей хочет развеять эту легенду раз и навсегда,\n" +
			"поэтому мы отправляемся в этот дом, чтобы увидеть всё своими глазами.");
		Log.out(p.getName() + ", хочешь ли ты пойти в этот путь с нами?");
	}

}