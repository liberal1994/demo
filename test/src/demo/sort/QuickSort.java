package demo.sort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {76, 23, 45, 62, 13, 34, 79, 8, 90};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        int index = getIndex(arr, low, high);
        if (low < index - 1) {
            quickSort(arr, low, index - 1);
        }
        if (index + 1 < high) {
            quickSort(arr, index + 1, high);
        }
    }

    private static int getIndex(int[] arr, int low, int high) {
        int selected = arr[low];
        int i = low;
        int j = high;
        while (i < j) {
            while (arr[j] >= selected && j > i) {
                j--;
            }
            if (j > i) {
                arr[i] = arr[j];
            }
            while (arr[i] <= selected && i < j) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[i] = selected;
        return i;
    }
}
