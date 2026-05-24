public class L509_FibNum {
    public static void main(String[] args) {
        int n = 4;

        System.out.println(fibNum(n));
    }


    public static int fibNum(int n){
        if(n == 1 || n == 0){
            return n;
        }

        return fibNum(n-1) +fibNum(n-2);
    }
}
