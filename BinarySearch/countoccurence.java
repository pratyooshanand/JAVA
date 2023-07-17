package BinarySearch;

public class countoccurence {

    public static int firstoccurence(int arr[],int x)
    {
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(arr[mid]>x)
            {
                end=mid-1;
            }
            else if(arr[mid]<x)
            {
                start=mid+1;
            }
            else
            {
                if(mid==0 || arr[mid]!=arr[mid-1])
                {
                    return mid;
                }
                else
                {
                    end=mid-1;
                }
            }
        }
        return -1;
    }
    public static int lastoccurence(int arr[],int x)
    {
        int start=0;
        int end=arr.length-1;
        int mid=(start+end)/2;
        while(start<=end)
        {
            if(arr[mid]>x)
            {
                end=mid-1;
            }
            else if(arr[mid]<x)
            {
                start=mid+1;
            }
            else
            {
                if(mid==arr.length-1 || arr[mid]!=arr[mid+1])
                {
                    return mid;
                }
                else
                {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static int occurencecount(int arr[],int x)
    {
        int first=firstoccurence(arr,x);
        if(first==-1)
        {
            return 0;
        }
        return lastoccurence(arr,x)-first+1;
    }
    public static void main(String[] args) {
        int arr[] = {10, 20, 20, 20, 40, 40};

		int x = 20;

		System.out.println(occurencecount(arr, x));
    }
}
