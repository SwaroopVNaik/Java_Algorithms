package Assignments;

import java.util.Scanner;

public class QuestionSixteen 
{

    static void largest(int numA, int numB, int numC)
    {

        if(numA > numB && numA >= numC)
        {
            System.out.println("NumA is largest Number");
        }
        else if(numB > numA && numB >= numC)
        {
            System.out.println("NumB is largest Number");
        }
        else
        {
            System.out.println("NumC is largest Number");
        }

        max(numA, numB, numC);
        max(numA, numB, numC);
    }

    static void max(int numA, int numB, int numC)
    {
        if(numA > numB && numA >= numC)
        {
            System.out.println("NumA is Maximum Number");
        }
        else if(numB > numA && numB >= numC)
        {
            System.out.println("NumB is Maximum Number");
        }
        else
        {
            System.out.println("NumC is Maximum Number");
        }
    }

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number A : ");
        int numA = sc.nextInt();

        System.out.println("Enter the Number B : ");
        int numB = sc.nextInt();

        System.out.println("Enter the number C : ");
        int numC = sc.nextInt();

        largest(numA, numB, numC);

        sc.close();

    }
}
