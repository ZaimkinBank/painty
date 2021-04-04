public class Cell {
    private int x;
    private int y;
    private boolean isBlack;

    public Cell(int x, int y, boolean isBlack) {
        this.x = x;
        this.y = y;
        this.isBlack = isBlack;
    }

    public boolean isBlack() {
        return isBlack;
    }

    public void setBlack(boolean black) {
        isBlack = black;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
