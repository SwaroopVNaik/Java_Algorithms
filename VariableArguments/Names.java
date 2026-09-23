package VariableArguments;

import java.util.Scanner;

public class Names {

    void getNames(String...names)
    {
        System.out.println();
        System.out.println("The Values in the Sting are : ");
        for(String name : names)
        {
            System.out.println(name);
        }
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of the array : ");
        int size = scanner.nextInt();

        String[] arr = new String[size];

        System.out.println("Enter " + size + " Elements of the array :");

        for(int index = 0; index < size; index = index + 1)
        {
            arr[index] = scanner.next();
        }

        Names obj = new Names();
        obj.getNames(arr);

        scanner.close();

    }

}
