package For_Each_And_Arrays;

public class LargestNumber {

    int getLargestNumber(int[] numbers)
    {

        int highestNumber = numbers[0];
        int secondHighestNumber = numbers[0];

        for(int number : numbers)
        {
            if(number > highestNumber)
            {
                highestNumber = number;
            }
        }

        return highestNumber;
    }

    

    public static void main(String[] args) 
    {

        int[] numbers = {25, 10, 45, 30, 15};

        LargestNumber obj = new LargestNumber();

        System.out.println(obj.getLargestNumber(numbers));

    }

}
