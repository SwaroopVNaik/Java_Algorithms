import java.util.Scanner;

public class SecondLargest{

    int getSecondLargest(int[] Array)
    {
        int largest = 0;
        int secondLargest = 0;

        for(int number : Array)
        {
            if(number > largest)
            {
                secondLargest = largest;
                largest = number;
            }
            else if(number > secondLargest && number != largest)
            {
                secondLargest = number;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the array : ");

        int size = scanner.nextInt();

        int [] Array = new int[size];

        System.out.println("Enter " + size + " elements of the array : ");

        for(int index = 0; index < size; index = index + 1)
        {
            Array[index] = scanner.nextInt();
        }

        SecondLargest obj = new SecondLargest();

        System.out.println();

        System.out.println("Second Largest Number in the Array :" + obj.getSecondLargest(Array));

    }

}