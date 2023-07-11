public class subarraywithgivensum {
    public static boolean naive(int arr[],int sum)
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int k=0;
            for(int j=i;j<n;j++)
            {
                k+=arr[j];
                if(sum==k)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean efficient(int arr[],int sum)
    {
        int n=arr.length;
        int s=0;
        int curr=0;
        for(int e=0;e<n;e++)
        {
            curr+=arr[e];
            while(sum<curr)
            {
                curr-=arr[s];
                s++;
            }
            if(curr==sum)
            {
                return true;
            }
        }
        return false;
        
    }
    public static void main(String[] args) {
        int arr[]={1,4,20,3,10,5};
        System.out.println(naive(arr,33));
        System.out.println(efficient(arr,33));
        int arr1[]={1,4,0,0,3,10,5};
        System.out.println(naive(arr1,7));
        int arr2[]={2,4};
        System.out.println(naive(arr2,3));
    }
}
