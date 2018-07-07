/**
 * 
 */
package it.unicam.cs.pa.ConnectFour;

/**
 * @author giacch�
 *
 */
public interface Player {
	
	PieceLocation insert(Piece piece);

	void winForError(Throwable e);

	void loseForError(Throwable e);

	void startMatch();

	void youWin();

	void youLose();

	void init(int pid, AbstractRuleSet ruleSet);
	
}
