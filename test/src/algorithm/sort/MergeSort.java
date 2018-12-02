package algorithm.sort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] arr = {23, 26, 5, 19, 52, 17, 28, 63, 77, 29};
//        System.out.println(Arrays.toString(arr));
//        System.out.println(Arrays.toString(arr));
        int arr1[]={2,5,8,9};
        int arr2[]={1,4,7,10};
        int newArr[]=mergeSort(arr1,arr2);
        System.out.println(Arrays.toString(newArr));

    }

    private static int[] mergeSort(int[] arr1,int arr2[]) {
        int s1=0,s2=0,k=0;
        int mergeArr[]=new int[arr1.length+arr2.length];
        while(s1<arr1.length&&s2<arr2.length){
            if(arr1[s1]<arr2[s2]){
                mergeArr[k++]=arr1[s1++];
                continue;
            }
            else {
                mergeArr[k++]=arr2[s2++];
                continue;
            }
        }
        if(s1<arr1.length){
            for(int i=s1;i<arr1.length;i++){
                mergeArr[k++]=arr1[i];
            }
        }
        if(s2<arr2.length){
            for(int j=s2;j<arr2.length;j++){
                mergeArr[k++]=arr2[j];
            }
        }
        return mergeArr;
    }


}
