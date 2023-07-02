public class Linearsearch {
            public static int search(int[] arr,int n,int k) {
            for(int i=0;i<n;i++)
            {
                if(arr[i]==k)
                {
                    return i;
                }
            }
            return -1;
            
        }
    public static void main(String[] args) {
        

        int[] arr= {10,20,30,40,50};

        // to find whether 20 is there in the array or not

        System.out.println(search(arr,5,20));

        // to find whether 30 is there in the array or not

        System.out.println(search(arr,5,40));

    }
}
