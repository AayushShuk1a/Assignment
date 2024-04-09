public class ChessBoard {
    private ChessPiece[][] pieces;

    public ChessBoard() {
        pieces = new ChessPiece[8][8];
    }

    public ChessPiece getPiece(int row, int column) {
        return pieces[row][column];
    }

    public void setPiece(int row, int column, ChessPiece piece) {
        pieces[row][column] = piece;
    }

    public boolean isOccupied(int row, int column) {
        return pieces[row][column] != null;
    }

    public boolean canMove(int row, int column, int newRow, int newColumn) {
        ChessPiece piece = getPiece(row, column);
        if (piece == null) {
            return false;
        }

        return piece.canMove(newRow, newColumn);
    }

    public void movePiece(int row, int column, int newRow, int newColumn) {
        ChessPiece piece = getPiece(row, column);
        setPiece(row, column, null);
        setPiece(newRow, newColumn, piece);
    }
}