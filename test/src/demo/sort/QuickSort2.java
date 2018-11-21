package demo.sort;

import java.util.Arrays;

import static demo.sort.QuickSort.quickSort;

public class QuickSort2 {
    public static void main(String[] args) {
        int arr[] = {76, 23, 45, 62, 13, 34, 79, 8, 90};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
    public static void quickSert(int[] arr,int low,int high){
        if(low>=high){
            return;
        }
        int selected=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            while(arr[j]>=selected&&j>i){
                j--;
            }
            if(j>i){
                arr[i]=arr[j];
            }
            while(arr[i]<=selected&&i<j){
                i++;
            }
            if(i<j){
                arr[j]=arr[i];
            }
        }
        arr[i]=selected;
        quickSort(arr,low,i-1);
        quickSort(arr,i+1,high);
    }

}
