public class deleteelement {
    public static int delte(int[] arr,int k,int n) {
        int i;
        for(i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                break;
            }
        }
        if(i==n)
        {
            return n;
        }
        for(int j=i;j<n;j++)
        {
            arr[j]=arr[j+1];
        }
        return n-1;
    }
    public static void main(String[] args) {
        int[] arr= {10,20,30,40,50,60};
        delte(arr, 20, 5);
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
}
