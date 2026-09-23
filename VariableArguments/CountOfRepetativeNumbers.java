package VariableArguments;

import java.util.Scanner;

public class CountOfRepetativeNumbers {

    void getCountOfNumbers(int key, int...numbers)
    {
        int Count = 0;

        for(int number : numbers)
        {
            if(key == number)
            {
                Count = Count + 1;
            }
        }
        
        System.out.println("The number of times the "+ key + " repeated is : " + Count);
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the Size of the Array :");
        int size = scanner.nextInt();

        System.out.println("Enter " + size + " Elements in the array : ");

        // Creating an array
        int[] arr = new int[size];

        for(int index = 0; index < size; index = index + 1)
        {
            arr[index] = scanner.nextInt();
        }

        System.out.println("Enter the key : ");
        int key = scanner.nextInt();

        CountOfRepetativeNumbers obj = new CountOfRepetativeNumbers();
        obj.getCountOfNumbers(key, arr);

    scanner.close();        
    }

}
