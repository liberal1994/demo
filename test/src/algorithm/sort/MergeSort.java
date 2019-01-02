package algorithm.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {23, 26, 5, 19, 52, 17, 28, 63, 77, 29};
        int[] temp = new int[arr.length];
        mergeSort(arr, 0, arr.length - 1, temp);
        System.out.println(Arrays.toString(arr));

    }

    private static void merge(int[] arr, int left, int mid, int right, int[] temp) {
        int s1 = left, s2 = mid + 1, k = left;
        while (s1 <= mid && s2 <= right) {
            if (arr[s1] < arr[s2]) {
                temp[k++] = arr[s1++];
            } else {
                temp[k++] = arr[s2++];
            }
        }
        while (s1 <= mid) {
            temp[k++] = arr[s1++];
        }
        while (s2 <= right) {
            temp[k++] = arr[s2++];
        }
        for (int index = left; index <= right; index++) {
            arr[index] = temp[index];
        }
    }

    private static void mergeSort(int[] arr, int left, int right, int[] temp) {
        if (left >= right) {
            return;
        }
        int mid = (left + right) >> 1;
        mergeSort(arr, left, mid, temp);
        mergeSort(arr, mid + 1, right, temp);
        merge(arr, left, mid, right, temp);
    }

}
