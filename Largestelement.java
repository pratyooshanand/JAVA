public class Largestelement {
    public static int Largestelementindex(int[] arr) {
        int size=arr.length;
        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        return max;
        
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        System.out.println(Largestelementindex(arr));

        int[] arr1={20,32,54,65,98,23};
        System.out.println(Largestelementindex(arr1));
    }
}
