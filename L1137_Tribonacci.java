public class L1137_Tribonacci {
    public static void main(String[] args) {
        System.out.println(triSeries(4));
    }

    public static int triSeries(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return triSeries(n-1) + triSeries(n-2) + triSeries(n-3);
    }
}
