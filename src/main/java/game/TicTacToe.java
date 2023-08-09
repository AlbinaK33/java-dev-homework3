package game;

import static game.AnswerPlayer.scan;
import java.util.logging.Logger;

public class TicTacToe {

    private  final Logger logger = Logger.getLogger(TicTacToe.class.getName());
    private static final char[] box = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public void start() {
        logger.info("Enter box number to select. Enjoy!\n");

        while (true) {
            CreateBoard.showBoard(box);

            if (WinnerCombination.choiceWinner(box, 'X')) {
                WinnerResult.getWinner((byte) 1);
                break;
            }
            if (WinnerCombination.choiceWinner(box, 'O')) {
                WinnerResult.getWinner((byte) 2);
                break;
            }
            if (!EmptyBoxAvailable.isEmptyBoxAvailable(box)){
                WinnerResult.getWinner((byte) 3);
               break;
            }
            AnswerPlayer.getAnswerPlayer(box);
            AnswerComputer.getAnswerComputer(box);
        }
        scan.close();
    }
}
