/**
 * 
 */
package it.unicam.cs.pa.ConnectFour.factories;

import java.io.InputStream;
import java.io.PrintStream;

import it.unicam.cs.pa.ConnectFour.CellStatus;
import it.unicam.cs.pa.ConnectFour.Piece;
import it.unicam.cs.pa.ConnectFour.Player;

/**
 * @author giacch�
 *
 */
public abstract class AbstractFactory {

	public abstract Player getPlayer(PlayerType type , String name , InputStream in , PrintStream out);
	public abstract Player getPlayer(PlayerType type , String name );
	public abstract Piece getPiece(CellStatus color);
	
}
