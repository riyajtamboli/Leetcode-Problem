public class L1464_MaxProduct {
    public static void main(String[] args) {

        int arr[] = {3,4,5,2};
        IO.println(product(arr));
    }

    public static int product(int arr[]){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(arr[i]> max){
                secMax = max;
                max = arr[i];
            }else if(arr[i] > secMax && arr[i]==max){
                secMax = arr[i];
            }
        }

        int product = (max -1 ) * (secMax -1);
        return product;
    }
}
