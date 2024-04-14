public class Pawn extends ChessPiece {

    public Pawn(int color, int position) {
        super("Pawn", color, position);
    }

    @Override
    public boolean canMove(int newPosition, int newColumn) {
        // Check if the move is valid for a pawn
        return true;
    }
}
