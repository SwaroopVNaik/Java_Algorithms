package Assignments;

import java.util.Scanner;

public class QuestionFourteen
{

    static void AreaOfSquare(int NumA)
    {
        int AreaSquare = NumA * NumA;

        System.out.println("The Area Of Square is : " + AreaSquare);

        Square();
    }

    static void Square()
    {

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the number to find the Sqaure of the number : ");
        int SQ1 = SC.nextInt();

        int SQR = SQ1 * SQ1;

        System.out.println("The Sqaure of the number is : " + SQR);

        SC.close();

    }
    
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number to find the Area of Square");

        System.out.println("Enter the Number of A : ");
        int NumA = sc.nextInt();

        AreaOfSquare(NumA);

        sc.close();
    }
}
