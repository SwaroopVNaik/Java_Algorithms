import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
public class LoopsAssignment
{

    public static void main(String[] args) 
    {

        // Question 1 : To check Number is Positive of Negative
        Scanner sc = new Scanner(System.in);

        // int number;
        // System.out.println("Enter a Number : ");
        // number = sc.nextInt();

        // if(number >= 1)
        //     {
        //     System.out.println("The Number is Positive");

        // } 
        // else if (number == 0)
        //     {
        //     System.out.println("The number is zero");
        // }
        // else
        // {
        //     System.out.println("The Number is Negative");
        // }.

        // Question 2 : check if the charcter is upper case 
        // Matches method check  (for loop pending)

        String Letter;

        System.out.println("Enter Your Single Character : ");
        Letter = sc.next();
         // the charAt 0 checks the first letter in the word 
        

        if(Letter.matches("[A-Z]"))
        {
            System.out.println("The charcter is UpperCase");
        }
        else
        {
            System.out.println("The charcter is LowerCase");
        }

        // Question 3 : largest of two number 

        // int num1;
        // int num2;

        // System.out.print("Enter the num1 : ");
        // num1 = sc.nextInt();

        // System.out.print("Enter the num2 : ");
        // num2 = sc.nextInt();

        // if(num1 > num2)
        // {
        //     System.out.println("The num1 is greater then num 2");
        // }
        // else if (num1 == num2)
        // {
        //     System.out.println("Both the numbers are equal");
        // }
        // else{
        //     System.out.println("num2 is greater then num1");
        // }


        // Question 4 : Largest of Numbers
        // int num1;
        // int num2;
        // int num3;

        // System.out.print("Enter the num1 : ");
        // num1 = sc.nextInt();

        // System.out.print("Enter the num2 : ");
        // num2 = sc.nextInt();

        // System.out.print("Enter the num3 : ");
        // num3 = sc.nextInt();

        // if(num1 > num2 && num1 > num3)
        // {
        //     System.out.println("num1 is greater then num 2 and num 3");
        // }
        // else if (num2 > num1 && num2 > num3)
        // {
        //     System.out.println("num2 is greater then num 1 and num 3");
        // }
        // else if (num3 > num1 && num3 > num2)
        // {
        //     System.out.println("num3 is greater then num1 and num2");
        // }
        // else{
        //     System.out.println("All three Numbers are equal");
        // }

        // Question 5 : to check number is odd or even

        // int num1;

        // System.out.println("Enter the Number to check odd or even :");
        // num1 = sc.nextInt();

        // if(num1 % 2 == 0)
        // {
        //     System.out.println("The number is Even");
        // }
        // else
        // {
        //     System.out.println("The number is odd");
        // }

        // Question 6 : to check age category (child teeneger adult and senior citizen)

        // int age; 

        // System.out.println("Enter your age to check the age category :  ");
        // age = sc.nextInt();

        // if(age > 0 && age <= 12)
        // {
        //     System.out.println("your child !");
        // }
        // else if (age >= 13 && age <= 19 )
        // {
        //     System.out.println("Your Teenager !");
        // }
        // else if (age >= 20 && age <= 59)
        // {
        //     System.out.println("Your adult !");
        // }
        // else
        // {
        //     System.out.println("Your a Senior Citizen");
        // }

        // Question 7 : Nested if (scholorship elegibality) compare with marks and family income 




        // Question 8: Build Calculator Using Calculator 

        // int num1;
        // int num2;
        // char operators;

        // System.out.println("Please Select the Operation you want to perform (+, -, *, / , %)");
        // operators = sc.next().charAt(0);

        // System.out.println("Enter Num1 : ");
        // num1 = sc.nextInt();

        // System.out.println("Enter Num2 : ");
        // num2 = sc.nextInt();

        // Menu driven user (ADD, instead of +)

        // switch(operators){
        //     case '+' :
        //         System.out.println("The Addtion of num1 and num2 is : " + (num1 + num2));
        //         break;
            
        //     case '-':
        //         System.out.println("The Subtraction of num1 and num2 is : " + (num1 - num2));
        //         break;

        //     case '*':
        //         System.out.println("The Multiplcation of num1 and num2 is : " + (num1 * num2));
        //         break;

        //     case '/':
        //         System.out.println("The Division of num1 and num2 is : " + (num1 / num2));
        //         break;
            
        //     case '%':
        //         System.out.println("The Modulas of num1 and num2 is : " + (num1 % num2));
        //         break;

        //     default:
        //         System.out.println("You have entered a Invalid Input ! please do check your input");


        // Question 9 : Nested If(Scholarship Eligibilty ) Compare with marks and family income

        // int Student_marks;
        // long family_Income;

        // System.out.println("Please do enter your marks to avail the scholarship eligibality :");
        // Student_marks = sc.nextInt();

        // System.out.println("Please do enter your salary to avail the scholarship eligibality :");
        // family_Income = sc.nextLong();

        // if((Student_marks >= 90 && Student_marks <=100) && (family_Income > 10000 && family_Income <= 180001))
        // {
        //     System.out.println("Eligible");
        // }
        // else if((Student_marks >= 75 && Student_marks < 89) && (family_Income >= 180001 && family_Income <= 250000 ))
        // {
        //     System.out.println("Application on Hold Please wait !");
        // }
        // else if(Student_marks <= 65 && family_Income >= 300000 )
        // {
        //     System.out.println("Not eligible");
        // }
        // else
        // {
        //     System.out.println("Invalid Input");
        // }


    }
        
}  

