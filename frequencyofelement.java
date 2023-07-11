public class frequencyofelement {
    public static void func(int[] arr)
    {
        int cnt=1;
        int tmp=arr[0];
        for(int i=1;i<arr.length;i++)
        {
                        if(arr[i]==tmp)
            {
                cnt++;
            }
            

            else 
            {
                System.out.println(tmp+" "+cnt);
                cnt=1;
                tmp=arr[i];
            }
            if(i==arr.length-1)
            {
                System.out.println(tmp+" "+cnt);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr={10,10,10,25,30,30};
        func(arr);
        int[] arr1={10,10,10,10,10};
        func(arr1);
        int[] arr2={30,20,10,5};
        func(arr2);
    }
}
