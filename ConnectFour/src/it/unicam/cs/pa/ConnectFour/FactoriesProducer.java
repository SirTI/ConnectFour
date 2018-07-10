/**
 * 
 */
package it.unicam.cs.pa.ConnectFour;

import it.unicam.cs.pa.ConnectFour.factories.AbstractFactory;
import it.unicam.cs.pa.ConnectFour.factories.PieceFactory;
import it.unicam.cs.pa.ConnectFour.factories.PlayerFactory;

/**
 * @author giacch�
 *
 */
public class FactoriesProducer {
	public static AbstractFactory getFactory(Factories factory) {
		switch (factory) {
		case PIECES:	return new PieceFactory();
		case PLAYERS:	return new PlayerFactory();
		default:		return null;
		}
	}
}
