public class majorityelement {
    public static int naive(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int cnt=1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    cnt++;
                }
            }
            if(cnt>n/2)
            {
                return i;
            }
        }
        return -1;
    }


    public static int efficient(int arr[])
    {
        int res=0;
        int cnt=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[res]==arr[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }

            if(cnt==0)
            {
                res++;
                cnt=1;
            }
        }
        cnt=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[res]==arr[i])
            {
                cnt++;
            }
        }
        if(cnt<=arr.length/2)
        {
            return -1;
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={8,3,4,8,8};
        System.out.println(naive(arr));
        int arr1[]={8,7,6,7,6,6,6,6,6};
        System.out.println(efficient(arr1));
    }
}
