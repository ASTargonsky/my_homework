package hw_3;

import java.util.Arrays;

public class Hw1 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Первоначальный массив: " + Arrays.toString(arr));
        System.out.println("Измененный массив: " + Arrays.toString(shiftArrayElements(arr)));
    }

    private static int[] shiftArrayElements(int[] array) {
        int lastElement = array.length - 1;
        int temp = array[lastElement];
        for (int i = lastElement; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
        return array;
    }
}
