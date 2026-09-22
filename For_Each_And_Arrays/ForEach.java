package For_Each_And_Arrays;

public class ForEach 
{

    static void traverse(int[] arr)
    {
        for(int x : arr)
        {
            System.out.print(x);

            if(x < arr.length)
            {
                System.out.print(",");
            }
            // implement if for to remove last coma (length - 1)
        }
    }

    public static void main(String[] args) 
    {

        // Creating array without refrence varible is called as anonyms array 
        // new int[] {1, 2, 3, 4}

        int [] arr = {1, 2, 3, 4};
        traverse(arr);

        // traverse(new int[] {1, 2, 3, 4});
    }

}
