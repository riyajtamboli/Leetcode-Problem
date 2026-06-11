import java.util.Arrays;

public class L977_SqureOfSortedArr {
    public static void main(String[] args) {
        int arr[] = {-4, -1,0,3,10};

       int [] arr2 = Arrays.stream(arr).map((n) -> n * n).toArray();

       Arrays.sort(arr2);
       IO.print(Arrays.toString(arr2));
    }
}
