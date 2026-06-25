public class L1800_MaxAscendingSum {
    public static void main(String[] args) {
        int arr[] = {10,20,30,5,10,50,40};

        int currSum = arr[0];
        int maxSum = arr[0];

        for(int i= 1; i<arr.length; i++){
            if(arr[i] > arr[i-1] ){
                currSum+= arr[i];
            }else{
                currSum = arr[i];
            }
            maxSum = Math.max(maxSum, currSum);
        }

        IO.print(maxSum);
    }
}
