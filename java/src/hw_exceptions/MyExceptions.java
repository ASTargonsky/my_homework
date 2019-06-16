package hw_exceptions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyExceptions {

    private static List<Double> doubleValues;

    public static void main(String[] args) {
        doubleValues = new ArrayList<>();
        try {
            doubleValues = readValues();
        } catch (NumberFormatException nfe) {
            System.out.println("Вы ввели не число: " + nfe.getMessage());
        } catch (Exception e) {
            System.out.println("Что-то пошло не так: " + e.getMessage());
        }
        System.out.println(doubleValues);
    }

    private static List<Double> readValues() throws RuntimeException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 6 значений");
        List<String> input = new ArrayList<>();
        String value1 = scanner.next();
        String value2 = scanner.next();
        String value3 = scanner.next();
        String value4 = scanner.next();
        String value5 = scanner.next();
        String value6 = scanner.next();
        input.add(value1);
        input.add(value2);
        input.add(value3);
        input.add(value4);
        input.add(value5);
        input.add(value6);
        for (String value : input) {
            Double doubleValue = Double.parseDouble(value);
            System.out.println("Вы ввели " + value);
            doubleValues.add(doubleValue);
        }
        return doubleValues;
    }
}
