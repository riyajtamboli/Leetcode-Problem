import java.util.ArrayList;
import java.util.Collections;

public class L4_Median{
    public static void main(String[] args) {
        int arr[] = {1,2};
        int arr2[] = {3,4};

        ArrayList<Integer> al = new ArrayList<>();


        for(int i=0; i<arr.length; i++){
            al.add(arr[i]);
        }
        for(int i=0; i<arr2.length; i++){
            al.add(arr2[i]);
        }
    
        Collections.sort(al);
       
        int n = al.size();

        if(n % 2 != 0){
            double median = al.get(n / 2 );
            IO.println(median);
        }else{
             double median = (al.get(n  / 2 - 1) + al.get(n / 2 )) / 2.0;
             IO.println(median);

        }
      

    }    
}