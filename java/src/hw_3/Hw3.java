package hw_3;

import java.util.Arrays;

public class Hw3 {

    public static void main(String[] args) {
        int[] firstArr = new int[]{1, 5, 3, 7, 6};
        System.out.println("Первый массив: " + Arrays.toString(firstArr));
        int[] secondArr = new int[]{5, 9, 4};
        System.out.println("Второй массив: " + Arrays.toString(secondArr));

        int[] mergedArr = merge(firstArr, secondArr);
        System.out.println("Объединенный массив: " + Arrays.toString(mergedArr));

        Arrays.sort(mergedArr);
        System.out.println("Отсортированный объединенный массив: " + Arrays.toString(mergedArr));
    }

    private static int[] merge(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];

        for (int i = 0; i < firstArray.length; i++) {
            result[i] = firstArray[i];
        }
        for (int j = firstArray.length; j < result.length; j++) {
            result[j] = secondArray[j - firstArray.length];
        }
        return result;
    }

}
