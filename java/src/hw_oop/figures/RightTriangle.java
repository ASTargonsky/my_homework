package hw_oop.figures;

import hw_oop.figures.common.Figure;

public class RightTriangle extends Figure {

    private Point point1;
    private Point point2;
    private Point point3;

    public RightTriangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public RightTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
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

    @Override
    public double calculateSquare(Point... points) {
        int a = findA(point1, point3);
        int b = findB(point2, point3);

        //площадь прямоугольного треугольника равна произведение катетов / 2
        return (a * b) / 2;
    }

    public int calculateHeight(Point... points) {
        int a = findA(point1, point3);
        int b = findB(point2, point3);
        int c = findC(a, b);

        //высота прямоугольного треугольника равна a * b / c
        return (a * b) / c;
    }

    private int findA(Point point1, Point point3) {
        return point3.getX() - Math.abs(point1.getX());
    }

    private int findB(Point point2, Point point3) {
        return point2.getY() - point3.getY();
    }

    private int findC(int a, int b) {
        //исходя из теоремы Пифагора, гипотенуза равна корню из суммы квадратов катетов
        return (int) Math.sqrt((Math.pow(a, 2) + Math.pow(b, 2)));
    }

    @Override
    public String toString() {
        return "Прямоугольный треугольник{" +
                "point1=" + point1 +
                ", point2=" + point2 +
                ", point3=" + point3 +
                ", square=" + square +
                '}';
    }
}

