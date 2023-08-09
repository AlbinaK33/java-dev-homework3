package game;
import java.util.logging.Logger;


public class WinnerResult {
    private  static final Logger logger = Logger.getLogger(WinnerResult.class.getName());

    protected static void getWinner(byte winner) {
        if (winner == 1) {
            logger.info("You won the game!\nThanks for playing!");
        } else if (winner == 2) {
            logger.info("You lost the game!\nThanks for playing!");
        } else if (winner == 3) {
            logger.info("It's a draw!\nThanks for playing!");
        }
    }
}
