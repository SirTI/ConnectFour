/**
 * 
 */
package it.unicam.cs.pa.ConnectFour.piece;

import it.unicam.cs.pa.ConnectFour.core.CellStatus;

/**
 * @author giacch�
 *
 */
// REPORT Null Object pattern to Pieces
public abstract class AbstractPiece {

	public abstract CellStatus getColor();

	public abstract int getId();

	public abstract boolean isNull();

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return getColor().toString();
	}

}
