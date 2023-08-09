package game;

public class EmptyBoxAvailable {

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
