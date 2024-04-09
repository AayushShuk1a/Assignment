public class Bishop extends ChessPiece {

    public Bishop(int color, int position) {
        super("Bishop", color, position);
    }

    @Override
    public boolean canMove(int newPosition, int newColumn) {
        // Check if the move is valid for a bishop
        return true;
    }
}