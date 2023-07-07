public class maximumindex {
    public static void printarray(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static int maxindex(int[] arr)
    {
        int n=arr.length;
        int[] arr1=new int[n];
        int[] arr2=new int[n];
        arr1[0]=arr[0];
        arr2[n-1]=arr[n-1];
        for(int i=1;i<n;i++)
        {
            arr1[i]=Math.min(arr1[i-1], arr[i]);
        }
        for(int j=n-2;j>=0;j--)
        {
            arr2[j]=Math.max(arr2[j+1],arr[j]);
        }
        int maxi=0;
        int i=0,j=0;
        while(i<n && j<n)
        {
            if(arr1[i]<=arr2[j])
            {
                maxi=Math.max(maxi,j-i);
                j++;
            }
            else
            {
                i++;
            }
        }
        return maxi;

    }
    public static void main(String[] args) {
        int[] ar={34, 8, 10, 3, 2, 80, 30, 33, 1,};
        System.out.print(maxindex(ar));
    }
}
