public class maxcircularsubarray {
    public static int naive(int arr[])
    {
        int n=arr.length;
        int res=arr[0];
        for(int i=0;i<n;i++)
        {
            int curr_sum=arr[i];
            int curr_max=arr[i];

            for(int j=1;j<n;j++)
            {
                int idx=(i+j)%n;
                curr_sum+=arr[j];
                curr_max=Math.max(curr_max,curr_sum);
            }
            res=Math.max(res,curr_max);
        }
        return res;
    }

    public static int efficient(int arr[])
    {
        int n=arr.length;
        int cnt=arr[0];
        int maxresult=arr[0];
        for(int i=1;i<n;i++)
        {
            if(arr[i]>cnt)
            {
                cnt=arr[i];
            }
            else
            {
                cnt+=arr[i];
            }
            maxresult=Math.max(maxresult,cnt);
        }
        int sum=arr[n-1];

        for(int i=0;i<n-1;i++)
        {
            int idx=(n+i)%n;
            if(sum<arr[idx])
            {
                sum=arr[idx];
            }
            else
            {
                sum+=arr[idx];
            }
        }
        return Math.max(sum,maxresult);
    }
    public static void main(String[] args) {
        int arr[] = {10,5,-5};
        System.out.println(naive(arr));
        System.out.println(efficient(arr));
        int arr1[] = {5,-2,3,4};
        System.out.println(naive(arr1));
        System.out.println(efficient(arr1));
    }
}
