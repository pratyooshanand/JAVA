public class searcharray {
    public static int insert(int[] arr,int n,int pos,int k) {
        if(n==pos)
        {
            return n;
        }
        int idx=pos-1;
        for(int i=n-1;i>=idx;i--)
        {
            arr[i+1]=arr[i];
        }
        arr[idx]=k;
        return n+1;

    }
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0]=10;
        arr[1]=30;
        arr[2]=40;
        //insert at pos 2
        insert(arr, 9, 2,20);

        // insert at pos 4
        insert(arr, 9, 4, 50);

        for(int i=0;i<6;i++)
        {
            System.out.println(arr[i]);
        }



    }
}
