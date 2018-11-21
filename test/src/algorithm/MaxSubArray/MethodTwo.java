package algorithm.MaxSubArray;

public class MethodTwo {
    public static void main(String[] args) {
        int arr[]={3,4,-3,1,5,13,-5,-18,12};
        System.out.println(test2(arr,0,arr.length-1));
    }
    public static int test2(int[] arr,int lo,int hi){
        if(lo==hi){
            if(arr[lo]>0){
                return arr[lo];
            }else{
                return 0;
            }
        }
        int mid=(lo+hi)/2;
        int maxLeft=test2(arr,lo,mid);
         int maxRight=test2(arr,mid+1,hi);
        int maxLeftPart=0;
        int currLeftPart=0;
        for(int i=mid;i>=lo;i--){
            currLeftPart+=arr[i];
            if(maxLeftPart<currLeftPart){
                maxLeftPart=currLeftPart;
            }
        }
        int maxRightPart=0;
        int currRightPart=0;
        for(int i=mid+1;i<=hi;i++){
            currRightPart+=arr[i];
            if(maxRightPart<currRightPart){
                maxRightPart=currRightPart;
            }
        }
        int maxMix=maxLeftPart+maxRightPart;
        return max3(maxLeft,maxRight,maxMix);
    }
    public static int max3(int a,int b,int c){
        return max2(a,b)>c?max2(a,b):c;
    }
    public static int max2(int a,int b){
        return a>b?a:b;
    }

}
