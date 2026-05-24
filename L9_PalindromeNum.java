import java.util.*;
public class L9_PalindromeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter Num : ");
            int n = sc.nextInt();
            System.out.println(palindrome(n));
            sc.close();
    }

    public static boolean palindrome(int n){
        int temp = n;
        int num2 = 0;
        while(temp > 0){
            num2 = temp  % 10 + num2 * 10;
            temp = temp / 10;
        }

        if(num2 == n){
            return true;
        }else{
            return false;
        }
    }
}
