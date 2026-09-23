public class LinearSearch 
{

    static Boolean iskeyfound(int [] arr, int key)
    {

        for(int x : arr)
        {
            if(x == key)
            {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {

        int[] arr = {10, 20, 30, 40, 50};
        System.out.println(iskeyfound(arr, 30));
        System.out.println(iskeyfound(arr, 100));

    }

}