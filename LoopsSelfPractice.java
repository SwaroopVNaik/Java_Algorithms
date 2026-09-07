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

    
        // int Number; 

        // Scanner Wloop = new Scanner(System.in);
        // System.out.println("Enter the Number");

        // Number = Wloop.nextInt();

        // int index = Number;
        // int end = 1;

        // do{

        //     System.out.println(index);
        //     index = index - 1;
    

        // }while(index >= end);

        // Printing each digit 

      //   int number; 

      //   int Reverse = 0;

      //   Scanner Digit = new Scanner(System.in);

      //   System.out.println("enter the number : ");
      //   number = Digit.nextInt();

      //   while(number > 0)
      //   {
      //       int result = number % 10;
            
      //       number = number/10;

      //       // Reverse = Reverse * 10 + result;

      //       System.out.println(result);

      //   }

        // count of digits

      //   int number; 
      //   int count = 0;
      //   int result;

      //   Scanner Digit = new Scanner(System.in);

      //   System.out.println("enter the number : ");
      //   number = Digit.nextInt();

      //   while(number > 0)
      //   {
      //       result = number % 10;
      //       count = count + 1;
      //       number = number / 10;
      //   }
      //   System.out.println(count);

        // Reverse

        // int number;
        // int Reverse = 0;

        // Scanner Rev = new Scanner(System.in);

        // System.out.println("Enter the number : ");
        // number = Rev.nextInt();

        // while(number != 0){

        //     // get last digit
        //     int result = number % 10;
        //     // Reverse Number store
        //     Reverse = Reverse * 10 + result;
        //     // store the number
        //     number = number / 10;

        // }
        // System.out.println(Reverse);

        // Palindrome

         // int number;
         // int Reverse = 0;
         // int temp = 0;

         // Scanner Rev = new Scanner(System.in);

         // System.out.println("Enter the number : ");
         // number = Rev.nextInt();

         // temp = number;

         // while(number > 0)
         // {
         //    int result = number % 10;
         //    Reverse = Reverse * 10 + result;
         //    number = number/10;
         // }

         // if(temp == Reverse)
         // {
         //    System.out.println("it is a palindrome");
         // }
         // else
         // {
         //    System.out.println("it is not a palindrome");
         // }


         // Printing Each Digit using do while loop 

         // int Number;

         // Scanner Dig = new Scanner(System.in);

         // System.out.println("Enter the Number : ");
         // Number = Dig.nextInt();

         // do{

         //    int result = Number % 10;
         //    System.out.println(result);
         //    Number = Number / 10;

         // }while(Number > 0);

         // Printing the count of digits using do while

         // int Number;
         // int Count = 0;
         // int result;
         // Scanner Digit = new Scanner(System.in);

         // System.out.println("Enter the Number : ");
         // Number = Digit.nextInt();

         // do{

         //    result = Number % 10;
         //    Count = Count + 1;
         //    Number = Number/10;

         // }while(Number > 0);

         // System.out.println(Count);

         // Reversing the number using do while

         // int number;
         // int Reverse = 0;

         // Scanner DoReverse = new Scanner(System.in);

         // System.out.println("Enter the number");
         // number = DoReverse.nextInt();

         // do{

         //    int result = number % 10;

            // Integer does not preseve leading Zero's 
         //    Reverse = Reverse * 10 + result;

         //    number = number/10;

         // }while(number > 0);

         // System.out.println("The Reverse Number is : " + Reverse);

         // doing sum of all digits using do while 

         // int number;
         // int result;
         // int sum = 0;

         // Scanner SUM = new Scanner(System.in);

         // System.out.println("Enter the number : ");
         // number = SUM.nextInt();

         // do{
         //    result = number % 10;
         //    sum = sum + result;
         //    number = number/10;

         // }while(number > 0);

         // System.out.println(sum);

         // ArmStrong 

         int Number; 
         int result;
         int ArmStrong = 0;
         int Sum = 0;
         int count = 0;

         Scanner Num = new Scanner(System.in);
         System.out.println("Enter the number to check the palindrome : ");
         Number = Num.nextInt();

         int UserNumber = Number;

         while(Number > 0)
         {

            result = Number % 10;
            ArmStrong = result * result * result;
            Sum = Sum + ArmStrong;
            Number = Number / 10;

         }

         if(UserNumber == Sum)
         {
            System.out.println("It is an ArmStrong number");
         }
         else
         {
            System.out.println("It is not an ArmStrong Number");
         }



      }
}
