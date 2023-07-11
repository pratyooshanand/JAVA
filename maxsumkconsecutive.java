public class maxsumkconsecutive {
    public static int naive(int arr[],int k)
    {
        int mx=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int sum=0;
            for(int j=i;j<i+k;j++)
            {
                if(j<arr.length)
                {
                sum+=arr[j];
                }
            }
            mx=Math.max(mx,sum);
        }
        return mx;
    }
    public static int efficient(int arr[],int k)
    {
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=arr[i];
        }
        int mx=sum;
        for(int i=1;i<arr.length-k;i++)
        {
            sum=sum-arr[i-1]+arr[k+i-1];
            mx=Math.max(mx,sum);
        }
        return mx;
    }
    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7};
        System.out.println(naive(arr,3));
        int arr1[] = {5,-10,6,90,3};
        System.out.println(efficient(arr1,2));

    }
}
