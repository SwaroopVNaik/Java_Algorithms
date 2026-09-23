public class ForEach 
{

    static void traverse(int[] arr)
    {

        int index = 1;

        for(int x : arr)
        {
            System.out.print(x);

            if(index < arr.length)
            {
                System.out.print(",");

                index = index + 1;
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
