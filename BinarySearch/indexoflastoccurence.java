package BinarySearch;

public class indexoflastoccurence {
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
                    if(mid==(arr.length-1) || arr[mid]!=arr[mid+1])
                    {
                        return mid;
                    }
                    else
                    {
                        start=mid+1;
                    }
                }
                mid=(start+end)/2;
        }
        return -1;
    
    }
    public static void main(String[] args) {
        int arr[]={1,10,10,10,20,30,40};
        System.out.println(lastoccurence(arr,40));
    }
}
