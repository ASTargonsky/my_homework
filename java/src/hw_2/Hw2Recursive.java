package hw_2;

import java.util.Scanner;

public class Hw2Recursive {

    private static long fibonacci(int i) {
        if (i == 0) {
            return 0;
        }
        if (i == 1) {
            return 1;
        }
        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int inputNumber = scanner.nextInt();

        int index = 0;

        while (true) {
            if (fibonacci(index) > inputNumber) {
                return;
            } else {
                System.out.print(fibonacci(index) + " ");
                ++index;
            }

        }
    }
}






