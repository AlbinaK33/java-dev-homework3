package game;

import java.util.logging.Logger;

public class LogicGame {

    private static boolean boxEmpty = false;
    private static final Logger logger = Logger.getLogger(LogicGame.class.getName());

    protected static void showBoard(char[] box) {
        logger.info(String.format("%n%n %c | %c | %c %n-----------%n" +
                        " %c | %c | %c %n-----------%n %c | %c | %c %n-----------%n",
                box[0], box[1], box[2], box[3], box[4], box[5], box[6], box[7], box[8]));

        if (!boxEmpty)
            cleanBoard(box);
    }

    private static void cleanBoard(char[] box) {
        for (byte i = 0; i < 9; i++)
            box[i] = ' ';
        boxEmpty = true;
    }

    protected static boolean choiceWinner(char[] box, char symbol) {

        return (box[0] == symbol && box[1] == symbol && box[2] == symbol)
                || (box[3] == symbol && box[4] == symbol && box[5] == symbol)
                || (box[6] == symbol && box[7] == symbol && box[8] == symbol)
                || (box[0] == symbol && box[3] == symbol && box[6] == symbol)
                || (box[1] == symbol && box[4] == symbol && box[7] == symbol)
                || (box[2] == symbol && box[5] == symbol && box[8] == symbol)
                || (box[0] == symbol && box[4] == symbol && box[8] == symbol)
                || (box[2] == symbol && box[4] == symbol && box[6] == symbol);
    }

    protected static void getWinner(byte winner) {
        if (winner == 1) {
            logger.info("You won the game!\nThanks for playing!");
        } else if (winner == 2) {
            logger.info("You lost the game!\nThanks for playing!");
        } else if (winner == 3) {
            logger.info("It's a draw!\nThanks for playing!");
        }
    }

    protected static boolean isEmptyBoxAvailable(char[] box) {
        boolean boxAvailable = false;
        for (byte i = 0; i < 9; i++) {
            if (box[i] != 'X' && box[i] != 'O') {
                boxAvailable = true;
                break;
            }
        }
        return boxAvailable;
    }
}
