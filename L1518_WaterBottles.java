public class L1518_WaterBottles{
    public static void main(String[] args) {
        System.out.println(numOfWaterBottle(15, 4));
    }

    public static int numOfWaterBottle(int no, int ex){
        int ans = no;
        while(no >= ex){

            int remainingBottle = no % ex;
            int newBottle = no / ex;

            ans = ans + newBottle;
            no = remainingBottle + newBottle;

        }

        return ans;
    }
}