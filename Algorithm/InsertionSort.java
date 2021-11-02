package Algorithm;

import java.util.Arrays;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int prev = i - 1;
            while ((prev >= 0) && (arr[prev] > temp)) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            arr[prev + 1] = temp;
        }
    }
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 2, 4, 3, 1};
        System.out.println("before : " + Arrays.toString(array));
        insertionSort(array);
        System.out.println("after : " + Arrays.toString(array));
    }
}
