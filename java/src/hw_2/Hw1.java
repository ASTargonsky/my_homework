package hw_2;

import java.util.Scanner;

public class Hw1 {

    public static void main(String[] args) {

        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
        System.out.println("Сумма цифр числа равна: " + sum);
    }
}
