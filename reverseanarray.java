public class reverseanarray {
    public static void arrayreverse(int[] arr)
    {
        int sz=arr.length;
        int i=0;
        int j=sz-1;
        while(i<j)
        {
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];

            i++;
            j--;
        }
    }
    public static void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        arrayreverse(arr);
        printarray(arr);
        int[] arr1={2,3,4,5,6,7,8};
        arrayreverse(arr1);
        printarray(arr1);
    }
    
}
