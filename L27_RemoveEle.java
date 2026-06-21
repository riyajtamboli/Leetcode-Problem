public class L27_RemoveEle{
    public static void main(String[] args) {
        int arr[] = {3,2,2,3};
        IO.println(removeElement(arr, 3));
    }

    public static int removeElement(int arr[], int k){
        int ptr = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] != k){
                arr[ptr] = arr[i];
                ptr++;
            }
        }

        return ptr;
    }
}