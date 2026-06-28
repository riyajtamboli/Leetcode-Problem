public class L35_SearchInsertPos{
    void main(){
        int arr[] = {1,3,5,6};
        IO.print(searchPos(arr, 7));
    }
    public static int searchPos(int arr[], int target){

        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start + end) /2;

            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }

        return start;
    }
}