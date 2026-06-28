public class L162_PeakElement{
    public static void main(String[] args) {
        int arr[] = {1,2,1,3,5,6,4};

        IO.println(peakElement(arr));
        
    }
    public static int peakElement(int arr[]){
        int start = 0;
        int end = arr.length-1;
        if(arr.length == 1){
            return 0;
        }
        while(start < end){
            int mid = (start+end) /2;

            if(arr[mid] > arr[mid+1]){
                end = mid;
            }else{
                start = mid +1;
            }

        }
        return start;
    }
}