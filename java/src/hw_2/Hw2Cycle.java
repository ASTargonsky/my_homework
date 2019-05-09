package hw_2;

import java.util.Scanner;

public class Hw2Cycle {

    public static void main(String[] args) {
        int n0;
        int n1 = 1;
        int n2 = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNumber = scanner.nextInt();

        for (; n2 <= inputNumber; n2 = n0 + n1) {
            n0 = n1;
            n1 = n2;
            System.out.print(n2 + " ");
        }

    }
}