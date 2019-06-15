package hw_oop.execution;

import hw_oop.Circle;
import hw_oop.Point;
import hw_oop.Rectangle;

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

        System.out.println("------ Задание 2 -------");

        Rectangle rectangle1 = new Rectangle(new Point(2,4), new Point(2,8), new Point(5,8), new Point(5,4));
        int diagonal1 = rectangle1.calculateDiagonal(rectangle1.getPoint1(), rectangle1.getPoint2(), rectangle1.getPoint3(), rectangle1.getPoint4());
        System.out.println("Диагональ прямоугольника со сторонами 3 и 4 приближенно равна: " + diagonal1);
        int rectangleSquare1 = rectangle1.calculateSquare(rectangle1.getPoint1(), rectangle1.getPoint3(), rectangle1.getPoint4());
        System.out.println("Площадь прямоугольника со сторонами 3 и 4 равна: " + rectangleSquare1);

        Rectangle rectangle2 = new Rectangle(new Point(2,0), new Point(2,4), new Point(8,4), new Point(8,0));
        int diagonal2 = rectangle2.calculateDiagonal(rectangle2.getPoint1(), rectangle2.getPoint2(), rectangle2.getPoint3(), rectangle2.getPoint4());
        System.out.println("Диагональ прямоугольника со сторонами 6 и 4 приближенно равна: " + diagonal2);
        int rectangleSquare2 = rectangle1.calculateSquare(rectangle2.getPoint1(), rectangle2.getPoint3(), rectangle2.getPoint4());
        System.out.println("Площадь прямоугольника со сторонами 6 и 4 равна: " + rectangleSquare2);

        Circle circle1 = new Circle(new Point(-3,2), new Point(5,2));
        int circumference1 = circle1.calculateCircumference(circle1.getPoint1(), circle1.getPoint2());
        System.out.println("Длина окружности приближенно равна: " + circumference1);
        double circleSquare1 = circle1.calculateSquare(circle1.getPoint1(), circle1.getPoint2());
        System.out.println("Площадь круга равна: " + circleSquare1);

        Circle circle2 = new Circle(new Point(0,4), new Point(0,8));
        int circumference2 = circle2.calculateCircumference(circle2.getPoint1(), circle2.getPoint2());
        System.out.println("Длина окружности приближенно равна: " + circumference2);
        double circleSquare2 = circle2.calculateSquare(circle2.getPoint1(), circle2.getPoint2());
        System.out.println("Площадь круга равна: " + circleSquare2);
    }
}
