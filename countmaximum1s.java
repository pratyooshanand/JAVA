public class countmaximum1s {
    public static int max1(int arr[])
    {
        int n=arr.length;
        int sum=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                sum++;
            }
            else
            {
                res=Math.max(sum,res);
                sum=0;
            }
            if(sum==n)
            {
                return sum;
            }

        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,1,0,1,0};
        System.out.println(max1(arr));
        int arr1[]={1,1,1,1};
        System.out.println(max1(arr1));
        int arr2[]={1,0,1,1,1,1,1,0,1,1};
        System.out.println(max1(arr2));

    }
}
