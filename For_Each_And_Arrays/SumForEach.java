package For_Each_And_Arrays;

public class SumForEach 
{

    static int findSum(int [] arr)
    {
        int sum = 0;

        for(int x : arr) // for each
        {
            // sum += x;
            sum = sum + x;
        }
        return sum;
    }

    public static void main(String[] args) 
    {

        int[] arr = {1, 3, 5, 7};
        System.out.println(findSum(arr));


    }

}
