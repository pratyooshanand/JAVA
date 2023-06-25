public class subsets {
    public static void allsubsets(String s,String curr,int i) {
        if(i==s.length())
        {
            System.out.print(curr);
            return;
        }
        allsubsets(s, curr, i+1);
        allsubsets(s, curr+s.charAt(i), i+1);
    }
    public static void main(String[] args) {
        String a="abc";
        allsubsets(a, " ", 0);
    }
    
}
