public class josephusproblem {
    public static int Josephus(int n,int k) {
        if(n==1)
        {
            return 0;
        }
        return (Josephus(n-1, k)+k)%n;
        
    }
    public static void main(String[] args) {
        System.out.println(Josephus(5,3));
        
    }
}
