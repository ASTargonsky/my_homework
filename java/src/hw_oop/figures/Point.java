package hw_oop.figures;

public final class Point {

    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }

    public Point distance(Point point) {
        return new Point(point.x - getX(), point.y - getY());
    }

    public Point translate(int x, int y) {
        return new Point(getX() + x, getY() + y);
    }

    public Point scale(int num) {
        return new Point(getX() * num, getY() * num);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}