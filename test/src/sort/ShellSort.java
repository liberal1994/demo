package sort;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] arr = {23, 26, 5, 19, 52, 17, 28, 63, 77, 29};
        System.out.println(Arrays.toString(arr));
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        if (null == arr) {
            return;
        }
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        while (h > 0) {
            for (int i = h; i < arr.length; i = i + h) {
                int temp = arr[i];
                int j = i;
                while (j > 0 && arr[j - h] > temp) {
                    arr[j] = arr[j - h];
                    j -= h;
                }
                arr[j] = temp;
            }
            h = (h - 1) / 3;
        }
    }
}
