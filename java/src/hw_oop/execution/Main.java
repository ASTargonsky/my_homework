package hw_oop.execution;

import hw_oop.Point;

public class Main {

    public static void main(String[] args) {
        Point distancePoint1 = new Point(-1, 8).distance(new Point(14, 9));
        System.out.println("Расстояние от точки {-1,8} до заданной {14,9}: " + distancePoint1.toString());

        Point distancePoint2 = new Point(4, 2).distance(new Point(7, 11));
        System.out.println("Расстояние от точки {4,2} до заданной {7,11}: " + distancePoint2.toString());

        Point translatedPoint = new Point(5, 7).translate(1, 3);
        System.out.println("Новая точка после перемещения точки {5,7} на {1,3}: " + translatedPoint.toString());

        Point scaledPoint = new Point(3, 5).scale(3);
        System.out.println("Новая точка после изменения масштаба точки {3,5} на 3: " + scaledPoint.toString());

        Point complexPoint1 = new Point(2, 3).translate(3, 7).scale(2);
        System.out.println("Новая точка после перемещения точки {2,3} на {3,7} и масштабирования на 2: " + complexPoint1.toString());

        Point complexPoint2 = new Point(4, 7).translate(5, 3).scale(3);
        System.out.println("Новая точка после перемещения точки {4,7} на {5,3} и масштабирования на 3: " + complexPoint2.toString());
    }
}
