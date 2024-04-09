public class Rook extends ChessPiece {

    public Rook(int color, int position) {
        super("Rook", color, position);
    }

    @Override
    public boolean canMove(int newPosition, int newColumn) {
        // Check if the move is valid for a rook
        return true;
    }
}