public class L319_BulbSwitcher {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(bulbSwitch(n));
    }

    public static int bulbSwitch(int n) {
        return (int)Math.sqrt(n);
    }
}