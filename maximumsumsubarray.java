public class maximumsumsubarray {
    public static int maxsumsubarray(int arr[])
    {
        int res=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            int curr=0;
            for(int j=i;j<arr.length;j++)
            {
                curr=curr+arr[j];
                res=Math.max(curr,res);
            }
        }
        return res;
    }
    public static int maxsum(int arr[])
    {
        int res=Integer.MIN_VALUE;
        int sum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>sum)
            {
                res=Math.max(res,arr[i]);
                sum=arr[i];
            }
            else
            {
                sum=sum+arr[i];
                res=Math.max(res,sum);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={1,-2,3,-1,2};
        System.out.println(maxsumsubarray(arr));
        System.out.println(maxsum(arr));
        int arr2[]={2,3,-8,7,-1,2,3};
        System.out.println(maxsumsubarray(arr2));
        System.out.println(maxsum(arr2));
    }
}
