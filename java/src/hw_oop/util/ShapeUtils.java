package hw_oop.util;

public final class ShapeUtils {

    private ShapeUtils() {

    }

    public static boolean isRectangle(int d1, int d2) {
        //если диагонали параллелограмма равны, то это прямоугольник
        if (d1 == d2) {
            System.out.println("Данная фигура - прямоугольник, т.к. диагонали равны.");
            return true;
        } else {
            System.out.println("Данная фигура не прямоугольник, т.к. диагонали не равны.");
            return false;
        }
    }

    public static boolean isTriangle(int a, int b, int c) {
        //если сумма любых двух сторон фигуры больше третьей, то это треугольник
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b))) {
            System.out.println("Данная фигура - треугольник.");
            return true;
        } else {
            System.out.println("Данная фигура не треугольник.");
            return false;
        }
    }
}
