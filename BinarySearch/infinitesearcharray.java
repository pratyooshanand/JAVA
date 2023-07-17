package BinarySearch;
public class infinitesearcharray {
    public static int naiveapproach(int arr[],int x)
    {
        int i=0;
        while(true)
        {
            if(arr[i]==x)
            {
                return i;
            }
            else if(arr[i]>x)
            {
                return -1;
            }
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,30,40,50,60,70,80,90};
        System.out.println(naiveapproach(arr,12));
    }
}
