public class moveallzeros {
    
    public static void allzeros(int[] arr)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]!=0)
            {
                i++;
                continue;
            }
            if(arr[j]==0)
            {
                j--;
                continue;
            }
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;
            j--;

        }
    }                                                  //  this method will shift all zeros, but will not keep the array in same order
    public static void allzeros1(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[j]!=0)
                    {
                        arr[i]=arr[i]+arr[j];
                        arr[j]=arr[i]-arr[j];
                        arr[i]=arr[i]-arr[j];
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={0,0,0,0,10,10,10,10};
        allzeros(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int[] arr1={10,0,2,0,40,0,32,0,12,0};
        allzeros1(arr1);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
