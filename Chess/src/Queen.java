public class Queen extends ChessPiece {

    public Queen(int color, int position) {
        super("Queen", color, position);
    }

    @Override
    public boolean canMove(int newPosition, int newColumn) {
        // Check if the move is valid for a queen
        return true;
    }
}
