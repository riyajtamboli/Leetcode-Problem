import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class L2089_FindTargetIndices {
    void main(){
        int arr[]= {1,2,5,2,3};
        IO.println(targetIndices(arr, 2));
    }

     public List<Integer> targetIndices(int[] nums, int target) {
        
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            al.add(nums[i]);
        }

        Collections.sort(al);
        int index = 0;
        for(int el : al){
            if(el == target){
                al2.add(index);
            }
            index++;
        }
        
        return al2;
    }
}
