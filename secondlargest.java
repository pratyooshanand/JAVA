public class secondlargest {
    public static int largest(int[] arr) {
        int size=arr.length;
        int idx=0;
        for(int i=1;i<size;i++)
        {
            if(arr[i]>arr[idx])
            {
                idx=i;
            }
        }
        return idx;
        
    }
    public static int secondlargeindex(int[] arr) {
        int idx=largest(arr);
        int index=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=arr[idx])
            {
                if(index==-1)
                {
                    index=0;
                }
                else if(arr[i]>arr[index])
                {
                    index=i;
                }
            }
        }
        return index;
        
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.print(secondlargeindex(arr));
    }
}
