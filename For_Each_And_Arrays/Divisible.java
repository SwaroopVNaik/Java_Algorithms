public class Divisible 
{

    void printDivisibleNumber(int[] arr)
    {
        for(int number : arr)
        {
            if(number%3 == 0)
            {
                System.out.println(number);
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 3, 6, 9, 12, 15, 18, 21, 24, 27, 30};

        Divisible obj = new Divisible();

        obj.printDivisibleNumber(arr);
    }

}
