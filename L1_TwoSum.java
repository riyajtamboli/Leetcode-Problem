import java.util.HashMap;

public class L1_TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            int complement = target - arr[i];

            if(hm.containsKey(complement)){
                System.out.println(hm.get(complement) + " "+ i);
            }
            hm.put(arr[i], i);
        }
    }
    
}
