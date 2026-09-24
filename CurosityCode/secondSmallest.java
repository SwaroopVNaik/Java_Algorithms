package CurosityCode;

import java.util.Scanner;

public class secondSmallest {

    int getSecondSmallest(int [] array)
    {
        int smallest = array[0];
        int secondSmallest = array[1];


        for(int index = 0; index < array.length; index = index + 1)
        {
            int number = array[index];

            if(number < smallest && number >= 0)
            {
                secondSmallest = smallest;
                smallest = number;
            }
            else if(number < secondSmallest && number != smallest && number >= 0)
            {
                secondSmallest = number;
            }
        }
        return secondSmallest;
    }
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int [] array = new int[size];

        System.out.println("Enter " + size + " the size of the array : ");

        for(int index = 0 ; index < array.length ; index = index + 1)
        {
            array[index] = scanner.nextInt();
        }

        secondSmallest obj = new secondSmallest();

        System.out.println("The Second Smallest Number is :  " + obj.getSecondSmallest(array));

        scanner.close();
    }

}
