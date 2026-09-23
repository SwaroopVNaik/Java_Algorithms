public class FindMax {

    static int findMax(int[] arr)
    {
        int max = arr[0];

        for(int x : arr)
        {
            if(x > max)
            {
                max = x;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        
        int[] arr = {10, 40, 90, 3};
        System.out.println(findMax(arr));

    }

}
