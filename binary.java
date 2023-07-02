public class binary {
    public static int BinarySearch(int[] arr,int x) {
        {
            int start=0;
            int end=arr.length;
            int mid=(start+end)/2;
            while(mid!=0)
            {
                if(arr[mid]>x)
                {
                    end=mid-1;
                }
                else if(arr[mid]<x)
                {
                    start=mid+1;
                }
                else if(arr[mid]==x)
                {
                    return mid;
                }
                mid=(start+end)/2;

            }
            return -1;
        }
        
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.print(BinarySearch(arr, 30));
    }
}
