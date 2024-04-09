public class Knight extends ChessPiece {

    public Knight(int color, int position) {
        super("Knight", color, position);
    }

    @Override
    public boolean canMove(int newPosition, int newColumn) {
        // Check if the move is valid for a knight
        return true;
    }
}