import java.util.*;

public class LoopsSelfPractice {
    public static void main(String[] args) 
    {

        // Question 1 : Write a java Program to take N numbers from the user and print 1 to N 

        // int Number;
        // int index;

        // Scanner SC = new Scanner(System.in);

        // System.out.println("Enter Any Number : ");
        // Number = SC.nextInt();

        // for(index = 1; index <= Number; index = index + 1)
        // {
        //     System.out.println(index);
        // }

        // Question 2 : Take a number form the user and print the numbers from N down to 1

        // int Num2;
        // int index;
        // int end = 1;

        // Scanner SCN = new Scanner(System.in);

        // System.out.println("Enter a number");
        // Num2 = SCN.nextInt();

        // for(index = Num2; index >= end; index = index - 1)
        // {
        //     System.out.println(index);
        // }

        // Question 3 : Take a number N from the user and print all the numbers from 1 to N 

        // int index;
        // int num3;

        // Scanner Eveen = new Scanner(System.in);

        // System.out.println("Enter the number");
        // num3 = Eveen.nextInt();

        // for(index = 2; index <= num3; index = index + 2)
        // {
        //     System.out.println(index);
        // }

        // Question 4 : Take a number form the user and print all the odd numbers from  1 to N 

        // int index; 
        // int num4;

        // Scanner ODD = new Scanner(System.in);

        // System.out.println("enter the number");
        // num4 = ODD.nextInt();

        // for(index = 1; index <= num4; index = index + 2)
        // {
        //     System.out.println(index);
        // }

        // Question 5 : Sum of first N number

        // int index;
        // int num4;
        // int result = 0;

        // Scanner Sum = new Scanner(System.in);

        // System.out.println("Enter a Number");
        // num4 = Sum.nextInt();

        // for(index = 1; index <= num4; index = index + 1)
        // {

        //     result = result + index;
        //     System.out.println(index + " = " + result);

        // }

        // Question 7 : Sum of digits from the user (while loop)

        // int num5;
        // int sum = 0;

        // Scanner Digits = new Scanner(System.in);

        // System.out.println("Enter the Number");
        // num5 = Digits.nextInt();

        // while(num5 > 0){

       
        //     int Digit = num5 % 10;
        //     sum = sum + Digit;
        //     num5 = num5 / 10;

        //     // While loop dosent always need increment

        // }
        // System.out.println(sum);

        // Factorial of N numbers 

        // int number;
        // int Fact = 1;

        // Scanner Factorial = new Scanner(System.in);

        // System.out.println("Enter the number");
        // number = Factorial.nextInt();

        // while(number >= 1)
        // {
        //     Fact = Fact * number;
        //     System.out.println(number + " = " + Fact);
        //     number = number - 1;

        // }

        // Multiplication Table (using while loop)

        // int number; 

        // Scanner WhileMultiple = new Scanner(System.in);

        // System.out.println("Enter the number :");
        // number = WhileMultiple.nextInt();

        // int index = 1;

        // while(index <= 10){

        //     int result = number * index;
        //     System.out.println(number + " X " + index + " = " + result);
        //     index = index + 1;

        // }

        // Print 1 to N (using do while)

        // int index = 0; 
        // int number;

        // Scanner Wloops = new Scanner(System.in);

        // System.out.println("Enter the number : ");
        // number = Wloops.nextInt();

        // do{

        //     System.out.println(index);
        //     index = index + 1;

        // }while(index <= number);

        // print N to 1 using do while 

    
        int Number; 

        Scanner Wloop = new Scanner(System.in);
        System.out.println("Enter the Number");

        Number = Wloop.nextInt();

        int index = Number;
        int end = 1;

        do{

            System.out.println(index);
            index = index - 1;
    

        }while(index >= end);

    }
}
