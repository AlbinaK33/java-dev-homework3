package game;

import java.util.logging.Logger;

public class CreateBoard {
    private static boolean boxEmpty = false;
    private static final Logger logger = Logger.getLogger(CreateBoard.class.getName());

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
}
