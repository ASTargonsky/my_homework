package hw_oop;

public class Rectangle {

    private Point point1;
    private Point point2;
    private Point point3;
    private Point point4;

    public Rectangle(Point point1, Point point2, Point point3, Point point4) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
        this.point4 = point4;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public Point getPoint4() {
        return point4;
    }

    public int calculateDiagonal(Point point1, Point point2, Point point3, Point point4) {
        //a и c должны быть равны между собой, как и b и d
        int a = findA(point1, point4);
        int b = findB(point3, point4);
        int c = findC(point2, point3);
        int d = findD(point1, point2);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        //диагональ прямоугольника равна корню из суммы квадратов a и b
        return (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    public int calculateSquare(Point point1, Point point3, Point point4) {
        int a = findA(point1, point4);
        int b = findB(point3, point4);

        //площадь прямоугольника равна a * b
        return a * b;
    }

    private int findA(Point point1, Point point4) {
        return point4.getX() - Math.abs(point1.getX());
    }

    private int findB(Point point3, Point point4) {
        return point3.getY() - Math.abs(point4.getY());
    }

    private int findC(Point point2, Point point3) {
        return point3.getX() - Math.abs(point2.getX());
    }

    private int findD(Point point1, Point point2) {
        return point2.getY() - Math.abs(point1.getY());
    }

}
