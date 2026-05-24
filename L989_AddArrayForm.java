import java.util.*;
public class L989_AddArrayForm {
    public static void main(String[] args) {
        int arr[] = {1,2,0,0};
        int k = 34;
        List<Integer> al = addArr(arr, k);

        al.forEach(ele -> IO.print(ele + " "));

    }

    public static List<Integer> addArr(int arr[], int k){
        int sum = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int num : arr){
            sum = sum * 10 + num;
        }

        sum = sum + k;

        while(sum > 0){
            int ld = sum % 10;
            al.add(0, ld);
            sum /= 10;
        }

        return al;
    }
}
