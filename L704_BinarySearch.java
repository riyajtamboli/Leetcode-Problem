public class L704_BinarySearch{
    void main(){
        int arr[] = {-1,0,3,5,9,12};
        System.out.println(binarySearch(arr, 9));
    }

    public static int binarySearch(int arr[], int target){
        int start =0;
        int end = arr.length-1;
        
        while(start <= end){
            int mid = (start+end) /2;
            if(arr[mid] == target){
                return mid;
            }

            if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return -1;
    }
}