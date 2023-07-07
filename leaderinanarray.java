import java.util.ArrayList;

public class leaderinanarray {
    public static void firstfun(int[] arr)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            boolean flag=false;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                    flag=true;
                    break;
                }
            }
            if(flag==false)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void fun2(int[] arr)
    {
        System.out.println();
        int n=arr.length;
        int tmp=arr[n-1];
        System.out.print(tmp+" ");
        for(int i=n-2;i>=0;i--)
        {
            if(tmp<arr[i])
            {
                tmp=arr[i];
                System.out.print(tmp+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
        firstfun(arr);
        fun2(arr);
    }
}
