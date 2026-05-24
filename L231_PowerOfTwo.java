public class L231_PowerOfTwo {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo(n));
    }

    public static boolean isPowerOfTwo(int n){

        int temp = n;
        if(n < 1){
            return false;
        }else if (n == 1){
            return true;
        }
        
        while(temp % 2 == 0){

            temp = temp  / 2;

            if(temp == 1){
                return true;
            }
        }

        return false;
    }
}
