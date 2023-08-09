package game;

public class WinnerCombination {

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
}
