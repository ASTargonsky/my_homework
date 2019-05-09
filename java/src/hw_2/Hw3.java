package hw_2;

import java.util.Scanner;

public class Hw3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество дней: ");
        int days = scanner.nextInt();
        days = days - 1;
        double sum = 0;
        int max = 0;
        for (int x = 0; x <= days; x++) {
            System.out.print("День " + (x + 1) + ". Введите количество дневных осадков: ");
            int rain = scanner.nextInt();
            sum = sum + rain;
            if (rain > max) {
                max = rain;
            }}
            String str1, str2;
            str1 = String.format("%.0f\n", sum);
            str2 = String.format("%.2f", (sum / (days + 1)));
            System.out.println("Количество дней равно " + (days + 1));
            System.out.print("Сумма осадков за период равна: " + str1);
            System.out.println("Среднее количество осадков за период равно: " + str2 + " /в день");
            System.out.print("Максимальное дневное количество осадков за период равно: " + max);

    }
}
