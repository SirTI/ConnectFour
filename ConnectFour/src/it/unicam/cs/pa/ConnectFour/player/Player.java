package it.unicam.cs.pa.ConnectFour.player;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;

import it.unicam.cs.pa.ConnectFour.core.ActionType;
import it.unicam.cs.pa.ConnectFour.core.MatchField;
import it.unicam.cs.pa.ConnectFour.exception.IllegalIdValue;
import it.unicam.cs.pa.ConnectFour.exception.InternalException;
import it.unicam.cs.pa.ConnectFour.ruleSet.RuleSet;

/**
 * @author giacche`
 *
 */
public abstract class Player {

	// REPORT sicche` referee e` statico, e` uguale per tutte le sottoclassi,
	// percio` 2 giocatori avranno lo stesso referee
	// TODO SICURO?!
	private static RuleSet referee = null;
	protected MatchField field;

	protected String name;
	protected int ID;

	protected BufferedReader in;
	protected PrintStream out;

	protected Player(String name, InputStream in, PrintStream out) {
		this.name = name;
		this.in = new BufferedReader(new InputStreamReader(in));
		this.out = out;
	}

	/**
	 * @return The action prompted by the player
	 * @throws InternalException
	 */
	public abstract ActionType chooseAction() throws InternalException;

	/**
	 * @return The column prompted by the player
	 * @throws InternalException
	 */
	public abstract int getColumn() throws InternalException;

	/**
	 * @return the {@link RuleSet referee}
	 */
	protected RuleSet getReferee() {
		return referee;
	}

	/**
	 * @param pid     - The player's id
	 * @param field   - The {@link MatchField}
	 * @param referee - The {@link RuleSet referee}
	 * @throws IllegalIdValue
	 */
	public abstract void init(int pid, MatchField field, RuleSet referee) throws IllegalIdValue;

	/**
	 * @param e The error that make player lose
	 */
	public abstract void loseForError(Throwable e);

	/**
	 * Initialize match's parameters
	 */
	public abstract void startMatch();

	/**
	 * @param e The error that make player win
	 */
	public abstract void winForError(Throwable e);

	/**
	 * Notify the player that it's lost
	 */
	public abstract void youLose();

	/**
	 * Notify the player that it's won
	 */
	public abstract void youWin();

	/**
	 * @return the player's id
	 */
	public int getId() {
		return this.ID;
	}

	/**
	 * @param referee1 - the {@link RuleSet referee}
	 * @return {@code true} if all's ok, {@code false} otherwise (e.g.
	 *         {@link RuleSet referee} is already assigned)
	 */
	protected boolean setReferee(RuleSet referee1) {
		if (referee != null)
			return false;
		referee = referee1;
		return true;
	}

}
