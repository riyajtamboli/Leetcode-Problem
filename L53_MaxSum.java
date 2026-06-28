public class L53_MaxSum {
    void main(){
        int arr[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //6
        IO.println(maxSum(arr));
    }

    public static int maxSum(int arr[]){
        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i=1; i<arr.length; i++){
           currSum = Math.max(arr[i], currSum+arr[i]);
           maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }
}
