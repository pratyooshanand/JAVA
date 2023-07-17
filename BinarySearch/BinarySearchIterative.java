package BinarySearch;

public class BinarySearchIterative {
    public static int BinarySearch(int arr[],int x)
    {
        int n=arr.length;
        int start=0;
        int end=n-1;
        while(start<end)
        {
            int mid=(start+end)/2;
            if(arr[mid]==x)
            {
                return mid;
            }
            else if(arr[mid]>x)
            {
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60};
        int arr1[]={10,20,30};
        int arr2[] = {2,3,4,5,6,7};
        System.out.println(BinarySearch(arr,50));
        System.out.println(BinarySearch(arr1,20));
        System.out.println(BinarySearch(arr2,4));

    }
}
