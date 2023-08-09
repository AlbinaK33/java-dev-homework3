package game;

import java.util.Scanner;
import java.util.logging.Logger;

public class AnswerPlayer {
    protected static final Scanner scan = new Scanner(System.in);
    private static final Logger logger = Logger.getLogger(AnswerPlayer.class.getName());

    protected static void getAnswerPlayer(char[] box) {
        while (true) {
            byte input = scan.nextByte();
            if (input > 0 && input < 10) {
                if (box[input - 1] == 'X' || box[input - 1] == 'O')
                    logger.info("That one is already in use. Enter another.");
                else {
                    box[input - 1] = 'X';
                    break;
                }
            } else {
                logger.info("Invalid input. Enter again.");
            }
        }
    }
}
