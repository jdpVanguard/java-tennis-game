import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Write a simple calculator for a Tennis game.
 * 
 * Scoring rules:
 * The games are scored starting at zero or "love".  The first point is called 15, then 30, then 40, then game point, which wins the game
 * If the players have the same score but less than three points each, it is the name of the point plus "all".  Example "fifteen all".
 * A player must be two points ahead in order to win the game.
 * If each player has won at least three points, and their score is the same, it is described as "deuce".
 * If each player has won at least three points, and one players is one score ahead, it is described as "advantage".
 *
 */

public class Main 
{
    public static void main(String[] args) {
	    Result result = JUnitCore.runClasses(TennisGameTest.class);
        if ( result.wasSuccessful()) {
            System.out.println("Complete!  Nice work.");
        } else {
            for (Failure failure : result.getFailures()) {
                System.out.println(failure.toString());
            }
            System.out.println("Please try again...");
        }
    }

}
