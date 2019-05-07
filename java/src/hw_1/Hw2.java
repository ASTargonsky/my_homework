package hw_1;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину первого дома");
        int a = scanner.nextInt();

        System.out.println("Введите ширину первого дома");
        int b = scanner.nextInt();

        System.out.println("Введите длину второго дома");
        int c = scanner.nextInt();

        System.out.println("Введите ширину второго дома");
        int d = scanner.nextInt();

        System.out.println("Введите длину участка");
        int e = scanner.nextInt();

        System.out.println("Введите ширину участка");
        int f = scanner.nextInt();

        int sqrFirstHome, sqrSecondHome, sqr;

        sqrFirstHome = a * b;
        sqrSecondHome = c * d;
        sqr = e * f;

        if (sqr < sqrFirstHome) {
            System.out.println("Первый дом не помещается на участке");
        } else {
            System.out.println("Первый дом помещается на участке");
        }

        if (sqr < sqrSecondHome) {
            System.out.println("Второй дом не помещается на участке");
        } else {
            System.out.println("Второй дом помещается на участке");
        }
    }

}
