import java.util.HashMap;
import java.util.Map;

public class L540_SingleElement{
    void main(){
        int arr[] = {1,1,2,3,3,4,4,8,8};

        IO.println(singleElement(arr));
    }

    public static int singleElement(int arr[]){
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i], hm.get(arr[i])+1);
            }else{
                hm.put(arr[i], 1);
            }
        }


        for(Map.Entry<Integer, Integer> h : hm.entrySet()){
                if(h.getValue()==1){
                    return h.getKey();
                }
        }

        return -1;
    }
}