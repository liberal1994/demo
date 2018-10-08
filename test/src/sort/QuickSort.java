package sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {23, 26, 5, 19, 52, 17, 28, 63, 77, 29};
        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int i = left;
        int j = right;
        int keyword = arr[left];
        while (i < j) {
            while (arr[j] >= keyword && j > i) {
                j--;
            }
            if (j > i) {
                arr[i] = arr[j];
            }
            while (arr[i] <= keyword && i < j) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
            }
        }
        arr[i] = keyword;
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }
}
