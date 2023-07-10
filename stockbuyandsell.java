public class stockbuyandsell {
    public static int buystock(int arr[],int start,int end)
    {
        if(start<=end)
        {
            return 0;
        }
        int profit=0;
        for(int i=start;i<end;i++)
        {
            for(int j=i+1;j<=end;j++)
            {
                if(arr[i]<arr[j])
                {
                    int curr_profit=(arr[j]-arr[i]) + buystock(arr,start,i-1) + buystock(arr,j+1,end);
                    profit=Math.max(profit,curr_profit);
                }
            }
        }
        return profit;
    }

    public static int stockbuy(int arr[])
    {
        int sz=arr.length;
        int profit=0;
        for(int i=0;i<sz-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                profit+=arr[i+1]-arr[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int arr[] ={1,5,3,1,2,8};
        System.out.println(stockbuy(arr));
    }
}
