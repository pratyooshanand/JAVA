import java.util.Scanner;

public class checkPalindrome {
    public static boolean isPalindrome(String s,int start,int end) {
        if(start==end)
        {
            return true;
        }
        return (s.charAt(start)==s.charAt(end)) && isPalindrome(s, start+1, end-1);

        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        System.out.print(isPalindrome(s,0,s.length()-1));
        
    }
}
