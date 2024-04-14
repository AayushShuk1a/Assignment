public class King extends ChessPiece {

    public King(int color, int position) {
        super("King", color, position);
    }

    @Override
    public boolean canMove(int newPosition, int newColumn) {
       
        return true;
    }
}