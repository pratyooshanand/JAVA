public class maximumdifference {
    public static int fun2(int[] arr)
    {
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                max=Math.max(max,arr[j]-arr[i]);
            }
        }
        return max;
    }
    public static int minimumfun(int[] arr)
    {
        int res=arr[1]-arr[0];
        int mn=arr[0];
        for(int j=1;j<arr.length;j++)
        {
            res=Math.max(res,arr[j]-mn);
            mn=Math.min(mn,arr[j]);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr={30,10,8,2};
        System.out.println(fun2(arr));
        int[] arr1={1,2,3,4};
        System.out.println(minimumfun(arr1));
    }
}
