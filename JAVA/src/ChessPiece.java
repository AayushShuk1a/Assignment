public class ChessPiece {
    private String name;
    private int color; 
    private int position; 

    public ChessPiece(String name, int color, int position) {
        this.name = name;
        this.color = color;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public int getColor() {
        return color;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public boolean canMove(int newPosition, int newColumn) {
       
        return true;
    }
}











