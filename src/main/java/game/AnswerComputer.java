package game;

public class AnswerComputer {
    protected static void getAnswerComputer(char[] box) {
        while (true) {
            byte rand = (byte) (Math.random() * (9 - 1 + 1) + 1);
            if (box[rand - 1] != 'X' && box[rand - 1] != 'O') {
                box[rand - 1] = 'O';
                break;
            }
        }
    }
}
