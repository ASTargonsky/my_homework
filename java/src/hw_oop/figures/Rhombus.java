package hw_oop.figures;

import hw_oop.figures.common.Figure;

public class Rhombus extends Figure {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;
    private int h;

    public Rhombus(Point point1, Point point2, Point point3, Point point4, int h) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
        this.h = h;
    }

    public Rhombus(int d1, int d2) {
        this.d1 = d1;
        this.d2 = d2;
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

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double calculateSquare(Point... points) {
        int a = findA(point1, point4);

        //площадь ромба равна a * h
        return a * h;
    }

    private int findA(Point point1, Point point4) {
        return point4.getX() - Math.abs(point1.getX());
    }

    @Override
    public String toString() {
        return "Ромб{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", point4=" + point4 +
                ", h=" + h +
                ", square=" + square +
                '}';
    }
}
