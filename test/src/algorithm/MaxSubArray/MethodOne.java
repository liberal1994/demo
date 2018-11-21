package algorithm.MaxSubArray;

public class MethodOne {
    public static void main(String[] args) {
//        int arr[]={3,4,-3,1,5,13,-5,-18,12};
        int arr[] = {-3, -4, -1, -7, -2, -8};
//        int arr[] ={};
        System.out.println(test1(arr));

    }

    public static int test1(int[] arr) {
        int maxSum = 0;
        int thisSum = 0;
        for (int i = 0; i < arr.length; i++) {
            thisSum += arr[i];
            if (maxSum < thisSum) {
                maxSum = thisSum;
            }
            if (thisSum < 0) {
                thisSum = 0;
            }
        }
        if (maxSum == 0) {
            maxSum = getMaxInArr(arr);
        }
        return maxSum;
    }

    private static int getMaxInArr(int[] arr) {

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;

    }
}
