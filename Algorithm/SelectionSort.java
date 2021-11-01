package Algorithm;

import java.util.Arrays;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int index , temp;
        for (int i = 0; i < arr.length - 1; i++) {
            index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 2, 4, 3, 1};
        System.out.println("before : " + Arrays.toString(array));
        selectionSort(array);
        System.out.println("after : " + Arrays.toString(array));
    }
}
