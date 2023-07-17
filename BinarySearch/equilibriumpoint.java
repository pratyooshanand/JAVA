package BinarySearch;
public class equilibriumpoint {
    public static int findpoint(int arr[])
    {
        int ls=0;
        for(int i=0;i<arr.length;i++)
        {
            ls+=arr[i];
        }
        int rs=0;
        for(int i=0;i<arr.length;i++)
        {
            ls-=arr[i];
            if(ls==rs)
            {
                return i;
            }
            rs+=arr[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {3,4,8,-9,9,7};
        System.out.println(findpoint(arr));
    }
}
