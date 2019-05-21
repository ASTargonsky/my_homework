package hw_3;

import java.util.Arrays;

public class Hw2 {

    public static void main(String[] args) {
        int[] arrayWithDuplicates = new int[]{1, 20, 30, 4, 50, 7, 1, 20, 4, 6, 8, 30};
        removeDuplicatesFromArray(arrayWithDuplicates);
    }

    private static void removeDuplicatesFromArray(int[] arrayWithDuplicates) {
        System.out.println("Первоначальный массив с дубликатами: " + Arrays.toString(arrayWithDuplicates));

        int length = arrayWithDuplicates.length;

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                //Если нашлись два одинаковых элемента, то заменяем дубликат последним уникальным элементом
                if (arrayWithDuplicates[i] == arrayWithDuplicates[j]) {
                    arrayWithDuplicates[j] = arrayWithDuplicates[length - 1];
                    length--;
                    j--;
                }
            }
        }

        int[] uniqueArray = Arrays.copyOf(arrayWithDuplicates, length);
        System.out.println("Новый массив с уникальными элементами: " + Arrays.toString(uniqueArray));
    }

}
