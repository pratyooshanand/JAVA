public class TowerofHanoi {
    public static void TofHanoi(int n,String A,String B,String C) {
        if(n==0)
        {
            return;
        }
        TofHanoi(n-1, A, C, B);
        System.out.println("Move from "+A+" to " + C);
        TofHanoi(n-1, B, A, C);
        
    }
    public static void main(String[] args) {
        TofHanoi(3,"A","B","C");
    }
}
