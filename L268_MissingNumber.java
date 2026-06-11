public class L268_MissingNumber {
    public static void main(String[] args) {
        int arr[] = {9,6,4,2,3,5,7,0,1};

        int sum = 0;

        for(int n : arr){
            sum = sum + n;
        }
        int n = arr.length - 1;
        int acutalSum = n + sum;
        int missingNumber = acutalSum - sum;
        IO.println("Missing Number : "+missingNumber);
    }
}
