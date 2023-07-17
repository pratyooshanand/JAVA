package BinarySearch;

public class BinarySearchRecursive {
    public static int BinarySearch(int arr[],int x,int start,int end)
    {
        if(start>end)
        {
            return -1;
        }
        int mid=(start+end)/2;
        if(arr[mid]==x)
        {
            return mid;
        }
        else if(arr[mid]>x)
        {
            BinarySearch(arr,x,start,mid-1);
        }
        else
        {
            BinarySearch(arr,x,mid+1,end);
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,30,40,50,60,70};
        int arr1[]={10,20,30};
        int arr2[] = {2,3,4,5,6,7};
        System.out.println(BinarySearch(arr,40,0,arr.length-1));
        System.out.println(BinarySearch(arr1,20,0,arr1.length-1));
        System.out.println(BinarySearch(arr2,4,0,arr2.length-1));
    }
}
