package it.unicam.cs.pa.ConnectFour;

import java.util.Properties;

/**
 * @author giacch�
 *
 */
public class RandomMatch {

	public static void main(String[] args) {
		AbstractFactory playerFactory = FactoriesProducer.getFactory(Factories.PLAYERS);
		Player p1 = playerFactory.getPlayer(PlayerType.RANDOM , "Pippo");
		Player p2 = playerFactory.getPlayer(PlayerType.RANDOM , "Pluto");
		
		Properties prop = new Properties();
		prop.setProperty("size", "6x7");
		prop.setProperty("ruleset", "default");
		// TODO FIRSTPLAYER MUST BE 0 OR 1
		prop.setProperty("firstPlayer", "0");
		
		Match m = new Match(p1, p2 , prop);
		
		m.play();
		
		
		// TODO play.
	}

}
