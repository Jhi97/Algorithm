package Algorithm;

import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] arr){
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    temp = arr[j - 1];
                    arr[j- 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 2, 4, 3, 1};
        System.out.println("before : " + Arrays.toString(array));
        bubbleSort(array);
        System.out.println("after : " + Arrays.toString(array));
    }
}
