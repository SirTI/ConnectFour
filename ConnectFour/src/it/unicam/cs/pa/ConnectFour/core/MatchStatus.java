package it.unicam.cs.pa.ConnectFour.core;

/**
 * @author giacch�
 *
 */
public enum MatchStatus {
	INIT,
	ARRANGE,
	END;

	/* (non-Javadoc)
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString() {
		switch (this) {
			case INIT: return "Initializing";
			case ARRANGE: return "Playing";
			case END: return "Game over";
		}
		return super.name();
	}
}
