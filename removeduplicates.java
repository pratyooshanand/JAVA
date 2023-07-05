public class removeduplicates {
    public static void duplicatesremovenaive(int[] arr)
    {
        int sz=arr.length;
        int[] temp=new int[sz];
        temp[0]=arr[0];
        int res=1;
        for(int i=1;i<sz-1;i++)
        {
            if(temp[res-1]!=arr[i])
            {
                temp[res]=arr[i];
                res++;
            }
            
        }
        for(int i=0;i<res;i++)
        {
            System.out.print(temp[i]+" ");
        }


    }
    public static void optimizedremovedduplicate(int[] arr)
    {
        int size=arr.length;
        int res=1;
        for(int i=1;i<size;i++)
        {
            if(arr[i]!=arr[res-1])
            {
                arr[res]=arr[i];
                res++;

            }
        }
        for(int i=0;i<res;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr1={10,10,10,20,30,30,40,40};
        duplicatesremovenaive(arr1);
        optimizedremovedduplicate(arr1);
    }
}
