public class NumberOfDigits 
{

    
    void getNumberOfDegits(int[] arr)
    {

        int positiveNumber = 0;
        int negativeNumber = 0;
        int ZeroDigits = 0;

        for(int number : arr)
        {
            if(number > 0)
            {
                positiveNumber = positiveNumber + 1;
            }
            else if(number < 0)
            {
                negativeNumber = negativeNumber + 1;
            }
            else 
            {
                ZeroDigits = ZeroDigits + 1;
            }

        }

        System.out.println();
        System.out.println("Positive Digits : " + positiveNumber);
        System.out.println("Negative Digits : " + negativeNumber);
        System.out.println("Zero Digits : " + ZeroDigits);


    }

    public static void main(String[] args) 
    {
        int[] arr = {4, -4, 7, 0, 10, -12, 5, 10, -12, 5, -10, 0, 7, 6, -5, 4, -3, 2};

        int index = 0;

        for(int number : arr)
        {
            System.out.print(number);

            if(index < arr.length - 1)
            {
                System.out.print(",");
            }

            index = index + 1;
        }

        // Instance Method Object Creation
        NumberOfDigits obj = new NumberOfDigits();
        
        // Accessing the method using the reference variable
        obj.getNumberOfDegits(arr);

    }

}
