public class L747_LargestAsTwice {
    public static void main(String[] args) {
        int arr[] = {3,6,1,0};
        IO.println(largestNum(arr));
        
    }

    public static int largestNum(int arr[]){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int maxIndex = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secMax = max;
                max = arr[i];
                maxIndex = i;
            }else if(secMax > arr[i]){
                secMax = arr[i];
            }
        }


        if(secMax * 2 <= max){
            return maxIndex;
        }else{
            return -1;
        }
    }
}
