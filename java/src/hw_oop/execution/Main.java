package hw_oop.execution;

import hw_oop.figures.Circle;
import hw_oop.figures.Point;
import hw_oop.figures.Rectangle;
import hw_oop.figures.Rhombus;
import hw_oop.figures.RightTriangle;
import hw_oop.figures.Square;
import hw_oop.figures.common.Figure;
import hw_oop.util.ShapeUtils;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(2,4), new Point(2,8), new Point(5,8), new Point(5,4));
        int diagonal1 = rectangle.calculateDiagonal(rectangle.getPoint1(), rectangle.getPoint3(), rectangle.getPoint4());
        System.out.println("Диагональ прямоугольника со сторонами 3 и 4 приближенно равна: " + diagonal1);
        rectangle.setSquare(rectangle.calculateSquare(rectangle.getPoint1(), rectangle.getPoint3(), rectangle.getPoint4()));
        System.out.println(rectangle.toString());

        Circle circle = new Circle(new Point(-3,2), new Point(5,2));
        int circumference1 = circle.calculateCircumference(circle.getPoint1(), circle.getPoint2());
        System.out.println("Длина окружности приближенно равна: " + circumference1);
        circle.setSquare(circle.calculateSquare(circle.getPoint1(), circle.getPoint2()));
        System.out.println(circle.toString());

        Square square = new Square(new Point(2,2), new Point(2,4), new Point(4,4), new Point(4,2));
        square.setSquare(square.calculateSquare(square.getPoint1(), square.getPoint4()));
        System.out.println(square.toString());

        Rhombus rhombus = new Rhombus(new Point(2,2), new Point(2,4), new Point(4,4), new Point(4,2), 4);
        rhombus.setSquare(rhombus.calculateSquare(rhombus.getPoint1(), rhombus.getPoint4()));
        System.out.println(rhombus.toString());

        Rhombus rhombus1 = new Rhombus(new Point(2,2), new Point(2,4), new Point(4,4), new Point(4,2), 4);
        rhombus1.setSquare(rhombus1.calculateSquare(rhombus1.getPoint1(), rhombus1.getPoint4()));

        RightTriangle triangle = new RightTriangle(new Point(2,2), new Point(5,6), new Point(5,2));
        triangle.setSquare(triangle.calculateSquare(triangle.getPoint1(), triangle.getPoint2(), triangle.getPoint3()));
        System.out.println(triangle.toString());
        int triangleHeight = triangle.calculateHeight(triangle.getPoint1(), triangle.getPoint2(), triangle.getPoint3());
        System.out.println("Высота прямоугольного треугольника равна: " + triangleHeight);

        circle.areSquaresEqual(rectangle);
        rhombus.areSquaresEqual(rhombus1);

        Figure figure1 = new Rectangle(4, 4);
        ShapeUtils.isRectangle(figure1.getD1(), figure1.getD2());

        Figure figure2 = new Rhombus(2, 3);
        ShapeUtils.isRectangle(figure2.getD1(), figure2.getD2());

        Figure figure3 = new RightTriangle(4, 5 ,8);
        ShapeUtils.isTriangle(figure3.getA(), figure3.getB(), figure3.getC());

    }
}
