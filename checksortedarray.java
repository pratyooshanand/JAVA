public class checksortedarray {
    
    public static boolean ifsortedarray(int[] arr)
    {
        int size=arr.length;
        if(size==1)
        {
            return true;
        }
        for(int i=0;i<size-2;i++)
        {
            if(i==(size-3))
            {
                return true;
            }
            if(arr[i]<=arr[i+1])
            {
                continue;
            }
            else
            {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.println(ifsortedarray(arr));
        int[] arr1={2,8,12,14,16,20};
        System.out.println(ifsortedarray(arr1));
        int[] arr2={3,1,2,5,3};
        System.out.println(ifsortedarray(arr2));
        int[] arr3={2};
        System.out.println(ifsortedarray(arr3));

    }
}
