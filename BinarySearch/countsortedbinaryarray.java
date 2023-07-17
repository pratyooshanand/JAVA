package BinarySearch;
public class countsortedbinaryarray {
    public static int countsorted1(int arr[])
    {
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<=end)
        {
            int mid=(start+end)/2;

            if(arr[mid]==0)
            {
                start=mid+1;
            }
            else
            {
                if(mid==0 || arr[mid]!=arr[mid-1])
                {
                    return n-mid;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,1,1,1,1};
        System.out.println(countsorted1(arr));
        int arr1[]={1,1,1,1};
        System.out.println(countsorted1(arr1));
        int arr2[]={0,1,1,1};
        System.out.println(countsorted1(arr2));
    }
}
