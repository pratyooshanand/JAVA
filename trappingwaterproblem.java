public class trappingwaterproblem {

    public static int tapwater(int arr[])
    {
        int n=arr.length;
        int res=0;
        for(int i=1;i<n-1;i++)
        {
            int lmax=arr[i];
            for(int j=0;j<i;j++)
            {
                lmax=Math.max(lmax,arr[j]);
            }
            int rmax=arr[i];
            for(int j=i+1;j<n;j++)
            {
                rmax=Math.max(rmax,arr[j]);
            }
            res=res+Math.min(lmax,rmax)-arr[i];
        }
        return res;
    }
    public static int anotherfunction(int arr[])
    {
        int n=arr.length;
        int res=0;
        int left[]= new int[n];
        int right[]=new int[n];
        left[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            left[i]=Math.max(arr[i],left[i-1]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
            right[i]=Math.max(arr[i],right[i+1]);
        }
        for(int i=1;i<n-1;i++)
        {
            res=res+Math.min(left[i],right[i])-arr[i];
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]={3,0,1,2,5};
        int res=tapwater(arr);
        int res1=anotherfunction(arr);
        System.out.print(res);
        System.out.print(res1);
    }
}
