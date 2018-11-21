package algorithm.MaxSubArray;

public class MethodThree {
    public static void main(String[] args) {
        int arr[] = {3, 4, -3, 1, 5, 13, -5, -18, 12};
        System.out.println(test3(arr));
    }

    public static int test3(int[] arr) {
        int accumMax = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                int thisMax = 0;
                for (int k = i; k <= j; k++) {
                    thisMax += arr[k];
                    if (thisMax > accumMax) {
                        accumMax = thisMax;
                    }
                }
            }
        }
        return accumMax;
    }
}
