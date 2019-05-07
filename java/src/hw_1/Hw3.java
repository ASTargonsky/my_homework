package hw_1;

import java.util.Scanner;

public class Hw3 {

    private static double discriminant(int a, int b, int c) {
        return (b * b) - (4 * a * c);
    }

    private static boolean isPositive(double discriminantValue) {
        if (discriminantValue > 0) {
            System.out.println("Дискриминант положителен, у уравнения два корня");
            return true;
        }
        return false;
    }

    private static boolean isZero(double discriminantValue) {
        if (discriminantValue == 0) {
            System.out.println("Дискриминант равен нулю, у уравнения один корень");
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        double sqrtD, xOne, xTwo;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Уравнение ax2+bx+c=0");
        System.out.print("Введите a ");
        int a = scanner.nextInt();
        System.out.print("Введите b ");
        int b = scanner.nextInt();
        System.out.print("Введите c ");
        int c = scanner.nextInt();

        double d = discriminant(a, b, c);
        if (isPositive(d)) {
            sqrtD = Math.sqrt(d);
            xOne = ((b * (-1) + sqrtD)) / 2 * a;
            xTwo = ((b * (-1) - sqrtD)) / 2 * a;
            System.out.println("Первый корень квадратного уравнения равен " + xOne);
            System.out.println("Второй корень квадратного уравнения равен " + xTwo);
        } else if (isZero(d)) {
            sqrtD = Math.sqrt(d);
            xOne = ((b * (-1) + sqrtD)) / 2 * a;
            System.out.println("Единственный корень квадратного уравнения равен " + xOne);

        } else {
            System.out.println("Дискриминант отрицателен, корней нет");
        }
    }
}