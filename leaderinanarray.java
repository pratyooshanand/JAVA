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
    public static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList<Integer> al=new ArrayList<Integer>();
        int tmp=arr[n-1];
        al.add(tmp);
        for(int i=n-2;i>=0;i--)
        {
            if(tmp<arr[i])
            {
                tmp=arr[i];
                al.add(tmp);
            }
            
        }
        ArrayList<Integer> ul=new ArrayList<Integer>();
        for(int i=0;i<al.size();i++)
        {
            ul.add(al.get(al.size()-i-1));
        }
        
        return ul;
    }
    public static void main(String[] args) {
        int[] arr={7,10,4,3,6,5,2};
        firstfun(arr);
        fun2(arr);
        ArrayList<Integer> al=new ArrayList<Integer>();
        al=leaders(arr, arr.length);
        System.out.print(al);
    }
}
