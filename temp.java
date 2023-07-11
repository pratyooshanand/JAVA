public class temp {
    public static void rotate(int arr[],int start,int end)
    {
        while(start<end)
        {
            arr[start]=arr[start]+arr[end];
            arr[end]=arr[start]-arr[end];
            arr[start]=arr[start]-arr[end];
            start++:
            end--;
        }
    }
    public static boolean checkRotatedAndSorted(int arr[], int num){
        
        int temp=0;
        for(int i=0;i<num-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                temp=i+1;
                break;
            }
        }
        rotate(arr,0,temp-1);
        rotate(arr,temp,num-1);
        rotate(arr,0,num-1);
        
        for(int i=0;i<num;i++)
        {
            if(arr[i]>arr[i+1])
            {
                return false;
            }
        }
        return true;
        // Your code here
        
    }
    public static void main(String[] args) {
        int arr[] ={3,4,1,2};
        checkRotatedAndSorted(arr,4);
    }
}
