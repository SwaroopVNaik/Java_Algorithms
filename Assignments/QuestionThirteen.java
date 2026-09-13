package Assignments;

import java.util.Scanner;

public class QuestionThirteen {

    void average(int numA, int numB, int numC)
    {
        int sum = numA + numB + numC;
        float Average = sum / 3;

        System.out.println("The Average of the number is : " + Average);

        Sum();
    }

    void Sum()
    {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number to find the Sum");

        System.out.println("Enter the numA : ");
        int numA = sc.nextInt();

        System.out.println("Enter the numB : ");
        int numB = sc.nextInt();

        System.out.println("Enter the numC : ");
        int numC = sc.nextInt();

        int SUM = numA + numB + numC;

        System.out.println("The sum of the number : " + SUM);

        sc.close();
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find average ");

        System.out.println("Enter Number A : ");
        int numA = sc.nextInt();

        System.out.println("Enter Number B : ");
        int numB = sc.nextInt();

        System.out.println("Enter Number C : ");
        int numC = sc.nextInt();

        QuestionThirteen obj = new QuestionThirteen();

        obj.average(numA, numB, numC);

        sc.close();

    }
}
