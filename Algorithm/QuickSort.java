package Algorithm;

import java.util.Arrays;

public class QuickSort {
    static void quickSort(int[] arr, int left, int right) {
        if(left>=right) return;

        int pivot = partition(arr, left, right);

        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot + 1, right);
    }

    static int partition(int[] arr, int left, int right) {
        //피벗 오른쪽 설정
        int pivot = arr[right];
        int i = left - 1;

        for (int j = left; j <= right - 1; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i+1, right);
        return i + 1;
    }

    static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 1, 2, 4, 3, 5};
        System.out.println("before : " + Arrays.toString(array));
        quickSort(array, 0, 9);
        System.out.println("after : " + Arrays.toString(array));
    }
}
