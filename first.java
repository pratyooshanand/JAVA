import java.util.Scanner;

/**
 * first
 */


public class first {

    public static void fun1(int n) {

        if(n==0)
        {
            return;
        }

        System.out.println(n);
        fun1(n-1);


 }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        fun1(t);
    }
}