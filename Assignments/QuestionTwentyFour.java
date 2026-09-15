package Assignments;

import java.util.*;

public class QuestionTwentyFour {


    void MiniCalculator()
    {

        Scanner obj = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("choose the Option");
        System.out.println("1. Addition");
        System.out.println("2. Substarction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division (Quotient)");
        System.out.println("5. modulas (Remainder)");
        System.out.println("========================================");
        System.out.println("Enter the choice in Numeric (ex -> 1, 2, etc : ") ;
        String Choice = obj.next();

        switch(Choice)
        {
            case "1":

                Addition();
                break;

            case "2":

                Substarction();
                break;
            
            case "3":

                Multiplication();
                break;
            
            case "4":

                Division();
                break;

            case "5":

                Modulas();
                break;
            
            default:
                System.out.println("Invalid Choice (Check the Menu) ");
        }

    }
    
    void Addition()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number A : ");
        int NumA = obj.nextInt();

        System.out.println("Enter the Number B : ");
        int NumB = obj.nextInt();

        System.out.println("NumA + NumB : " + (NumA + NumB));
    }

    void Substarction()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number A : ");
        int NumA = obj.nextInt();

        System.out.println("Enter the Number B : ");
        int NumB = obj.nextInt();

        System.out.println("NumA - NumB : " + (NumA - NumB));
    }

    void Multiplication()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number A : ");
        int NumA = obj.nextInt();

        System.out.println("Enter the Number B : ");
        int NumB = obj.nextInt();

        System.out.println("NumA X NumB : " + (NumA * NumB));
    }

    void Division()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number A : ");
        int NumA = obj.nextInt();

        System.out.println("Enter the Number B : ");
        int NumB = obj.nextInt();

        System.out.println("NumA / NumB : " + (NumA / NumB));
    }

    void Modulas()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Number A : ");
        int NumA = obj.nextInt();

        System.out.println("Enter the Number B : ");
        int NumB = obj.nextInt();

        System.out.println("NumA % NumB : " + (NumA % NumB));
    }
    
    public static void main(String[] args)
    {

        QuestionTwentyFour obj = new QuestionTwentyFour();
        obj.MiniCalculator();

    }

}
