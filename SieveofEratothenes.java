import java.util.Scanner;

public class SieveofEratothenes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        boolean[] arr = new boolean[t+1];
        for(int i=0;i<t;i++)
        {
            arr[i]=true;
        }
        for(int i=2;i<=t;i++)
        {
            for(int j=i*2;j<=t;j=j+i)
            {
                if(arr[j]!=false)
                {
                    arr[j]=false;
                }
            }
        }
        for(int i=2;i<=t;i++)
        {
            if(arr[i]==true)
            {
                System.out.print(i+" ");
            }
        }


    }
}
