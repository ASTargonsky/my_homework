package hw_oop;

public class Circle {

    private Point point1;
    private Point point2;
    private int d;

    public Circle(Point point1, Point point2) {
        this.point1 = point1;
        this.point2 = point2;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public int calculateCircumference(Point point1, Point point2) {
        d = findDiameter(point1, point2);
        System.out.println("Диаметр круга равен: " + d);

        //длина окружности равна PI * d
        return (int) Math.PI * d;
    }

    public double calculateSquare(Point point1, Point point2) {
        d = findDiameter(point1, point2);

        //площадь круга равна PI/4 * d2
        return Math.PI / 4 * Math.pow(d, 2);
    }

    private int findDiameter(Point point1, Point point2) {
        if (point2.getX() - Math.abs(point1.getX()) != 0) {
            d = point2.getX() - Math.abs(point1.getX());
        } else {
            d = point2.getY() - Math.abs(point1.getY());
        }
        return d;
    }
}
