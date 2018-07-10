/**
 * 
 */
package it.unicam.cs.pa.ConnectFour;

/**
 * @author giacch�
 *
 */
public class FactoriesProducer {
	public static AbstractFactory getFactory(Factories factory) throws IllegalArgumentException {
		switch (factory) {
		case PIECES:	return new PieceFactory();
		case PLAYERS:	return new PlayerFactory();
		case REFEREE:	return new RefereeFactory();
		default:		throw new IllegalArgumentException("factory '" + factory + "' is unknown.");
		}
	}
}
