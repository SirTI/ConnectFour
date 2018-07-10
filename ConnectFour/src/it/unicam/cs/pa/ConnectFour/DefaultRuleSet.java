/**
 * 
 */
package it.unicam.cs.pa.ConnectFour;

/**
 * @author giacch�
 *
 */
public class DefaultRuleSet implements RuleSet {

	private static final ActionType[] allowedActions = { ActionType.INSERT };
	
	/* (non-Javadoc)
	 * @see it.unicam.cs.pa.ConnectFour.RuleSet#isValidInsert()
	 */
	@Override
	public boolean isValidInsert() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see it.unicam.cs.pa.ConnectFour.RuleSet#isInBound()
	 */
	@Override
	public boolean isInBound() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see it.unicam.cs.pa.ConnectFour.RuleSet#insert(int, it.unicam.cs.pa.ConnectFour.Cell[][])
	 */
	@Override
	public PieceLocation insert(int column, Cell[][] field) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see it.unicam.cs.pa.ConnectFour.RuleSet#pop(it.unicam.cs.pa.ConnectFour.Cell[])
	 */
	@Override
	public Cell[] pop(Cell[] column) {
		return column;
	}

	/* (non-Javadoc)
	 * @see it.unicam.cs.pa.ConnectFour.RuleSet#winner(it.unicam.cs.pa.ConnectFour.Cell[][])
	 */
	@Override
	public CellStatus winner(Cell[][] field) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see it.unicam.cs.pa.ConnectFour.RuleSet#actionsNumber()
	 */
	@Override
	public int actionsNumber() {
		return allowedActions.length;
	}
	
	public ActionType[] getAllowedActions() {
		return allowedActions;
	}

}
