public class rotateleftbyd {
   
    public static void arrayrotate(int[] arr,int d)
    {
        int n=arr.length;
        int[] temp=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i-d]=arr[i];
        }
        for(int i=d;i<n;i++)
        {
            arr[i]=temp[i-d];
        }
        
    }
    public static void reversearray(int[] arr,int low,int high)
    {
        while(low<high)
        {
            arr[low]=arr[low]+arr[high];
            arr[high]=arr[low]-arr[high];
            arr[low]=arr[low]-arr[high];

            low++;
            high--;
        }
    }
    public static void arrayrotatemethod2(int[] arr,int d)
    {
        reversearray(arr, 0, d-1);
        reversearray(arr, d, arr.length-1);
        reversearray(arr, 0, arr.length-1);

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        arrayrotate(arr, 2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr2={10,15,20,25,30,35};
        arrayrotatemethod2(arr2, 2);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
}
