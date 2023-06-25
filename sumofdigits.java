import java.util.Scanner;

public class sumofdigits {
    public static int digitSum(int n) {
        if(n/10==0)
        {
            return n;
        }
        return n%10 + digitSum(n/10);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        System.out.print(digitSum(t));

        
    }
}
