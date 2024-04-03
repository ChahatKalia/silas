
public class Point {
    //FIELDS
    private int x;
    private int y;

    //CONSTRUCTORS
    public Point() {
        x = 0;
        y = 0;
    }
    public Point(int initX, int initY) {
        x = initX;
        y = initY;
    }
    
    //GETTERS
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    //SETTERS
    public void setX(int xx) {
        x = xx;
    }
    public void setY(int y) {
        this.y = y;
    }

    //METHODS
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public boolean equals(Point other) {
        return x == other.getX() && y == other.getY();
    }

    public double slope(Point other) {
        return (other.getX() - (double)x)  /  (other.getY() - y);
    }
}