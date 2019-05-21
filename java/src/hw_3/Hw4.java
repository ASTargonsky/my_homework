package hw_3;

import java.util.Arrays;

public class Hw4 {

    public static void main(String[] args) {
        int[] firstArr = {1, 2, 3, 4, 5};
        int[] secondArr = {6, 7, 8, 9, 10};
        int[][] twoDimensionalArr = {firstArr, secondArr};
        System.out.println("Двумерный массив: " + Arrays.deepToString(twoDimensionalArr));

        int[] linearizedArray = linearize(twoDimensionalArr);
        System.out.println("Одномерный массив: " + Arrays.toString(linearizedArray));
    }

    private static int[] linearize(int[][] twoDimensionalArr) {
        int[] result = new int[twoDimensionalArr[0].length + twoDimensionalArr[1].length];
        int k = 0;
        for (int i = 0; i < twoDimensionalArr.length; i++) {
            for (int j = 0; j < twoDimensionalArr[i].length; j++) {
                while (k < result.length) {
                    result[k] = twoDimensionalArr[i][j];
                    k++;
                    break;
                }
            }
        }
        return result;
    }
}
