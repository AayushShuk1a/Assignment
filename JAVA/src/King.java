public class King extends ChessPiece {

    public King(int color, int position) {
        super("King", color, position);
    }

    @Override
    public boolean canMove(int newPosition, int newColumn) {
        // Check if the move is valid for a king
        return true;
    }
}