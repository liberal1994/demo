package algorithm.MaxSubArray;

public class MethodFour {
    public static void main(String[] args) {
        int arr[] = {3, 4, -3, 1, 5, 13, -5, -18, 12};
        System.out.println(test4(arr));
    }
    public static int test4(int[] arr){
        int accumMax=0;
        for(int i=0;i<arr.length;i++){
            int thisMax=0;
            for(int j=i;j<arr.length;j++){
                thisMax+=arr[j];
                if(thisMax>accumMax){
                    accumMax=thisMax;
                }

            }
        }
        return accumMax;
    }

}
