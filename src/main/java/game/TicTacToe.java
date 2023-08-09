package game;

import static game.AnswerPlayer.scan;
import java.util.logging.Logger;

public class TicTacToe {

    private  final Logger logger = Logger.getLogger(TicTacToe.class.getName());
    private static final char[] box = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    public void start() {
        logger.info("Enter box number to select. Enjoy!\n");

        while (true) {
            LogicGame.showBoard(box);

            if (LogicGame.choiceWinner(box, 'X')) {
                LogicGame.getWinner((byte) 1);
                break;
            }
            if (LogicGame.choiceWinner(box, 'O')) {
                LogicGame.getWinner((byte) 2);
                break;
            }
            if (!LogicGame.isEmptyBoxAvailable(box)){
                LogicGame.getWinner((byte) 3);
               break;
            }
            AnswerPlayer.getAnswerPlayer(box);
            AnswerComputer.getAnswerComputer(box);
        }
        scan.close();
    }
}
