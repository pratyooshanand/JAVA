public class maximumlengthevenoddsubarray {
    public static int maxevenoddsubarray(int arr[])
    {
        int cnt=1;
        int maxresult=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if((arr[i]%2==0 && arr[i+1]%2!=0)||(arr[i]%2!=0 && arr[i+1]%2==0))
            {
                cnt++;
                maxresult=Math.max(cnt,maxresult);
            }
            else
            {
                cnt=1;
            }
            
        }
        return maxresult;

    }
    public static int naivesolution(int arr[])
    {
        int res=1;
        for(int i=0;i<arr.length;i++)
        {
            int curr=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if((arr[j]%2==0 && arr[j-1]%2!=0)||(arr[j]%2!=0 && arr[j-1]%2==0))
                {
                    curr++;
                }
                else 
                {
                    break;
                }
            }
            res=Math.max(res,curr);
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={10,12,14,7,8};
        System.out.println(maxevenoddsubarray(arr));
        int arr1[]={7,10,13,14};
        System.out.println(naivesolution(arr1));
        int arr2[]={10,12,8,2};
        System.out.println(naivesolution(arr2));



    }
}
