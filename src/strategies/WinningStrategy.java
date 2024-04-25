package strategies;

import model.Board;
import model.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move move);
}
