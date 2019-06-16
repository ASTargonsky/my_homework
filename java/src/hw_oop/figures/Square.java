package hw_oop.figures;

import hw_oop.figures.common.Figure;

public class Square extends Figure {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Square(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public void setPoint4(Point point4) {
        this.point4 = point4;
    }

    @Override
    public double calculateSquare(Point... points) {
        int a = findA(point1, point4);

        //площадь квадрата равна а в квадрате
        return Math.pow(a, 2);
    }

    private int findA(Point point1, Point point4) {
        return point4.getX() - Math.abs(point1.getX());
    }

    @Override
    public String toString() {
        return "Квадрат{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                ", square=" + square +
                '}';
    }
}
