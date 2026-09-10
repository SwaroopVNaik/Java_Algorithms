import java.util.*;
public class MethodsAssignment 
{

    // Static Method to add two numbers
    static void Sum(int x, int y)
    {

        int z = x + y;
        System.out.println("Printing from Static Method " + z);

    }

    // Instance Method to add two numbers
    void ADD(int A, int B)
    {

        int C = A + B;
        System.out.println("Printing from Instance Method " + C);

    }

    // Static Method to return Square of number 
    static int Sqaure()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number To find the square");
        int sqr = sc.nextInt();
        return sqr * sqr;
    }

    // instance method using return square of number

    int SQUARE()
    {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number To find the square");
        int sqr = scn.nextInt();
        return sqr * sqr;

    }

    // Static Method using Even or Odd 
    static boolean Even(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Number To check even or odd");
        int number = scan.nextInt();

        return number%2 == 0;

    }

    boolean EvenOrOdd(){

        Scanner scann = new Scanner(System.in);
        System.out.println("Enter the Number To check even or odd");
        int number = scann.nextInt();

        return number%2 == 0;


    }

    static void MaxOfThree(){

        Scanner saan = new Scanner(System.in);

        System.out.println("Enter the Number A : ");
        int num1 = saan.nextInt();

        System.out.println("Enter the Number B : ");
        int num2 = saan.nextInt();

        System.out.println("Enter the Number C :");
        int num3 = saan.nextInt();

        if( (num1 > num2) && (num1 > num3) )
        {
            System.out.println(num1 +" is greater then " + num2 + " and " + num3);
        }
        else if((num2 > num1) && (num2 > num3))
        {
            System.out.println(num2 +" is greater then " + num1 + " and " + num3);
        }
        else
        {
            System.out.println(num3 +" is greater then " + num1 + " and " + num2);
        }

        saan.close();
    }

        void MaxOfNumber(){
            
            Scanner saan = new Scanner(System.in);

            System.out.println("Enter the Number A : ");
            int num1 = saan.nextInt();

            System.out.println("Enter the Number B : ");
            int num2 = saan.nextInt();

            System.out.println("Enter the Number C :");
            int num3 = saan.nextInt();

            if( (num1 > num2) && (num1 > num3) )
            {
                System.out.println(num1 +" is greater then " + num2 + " and " + num3);
            }
            else if((num2 > num1) && (num2 > num3))
            {
                System.out.println(num2 +" is greater then " + num1 + " and " + num3);
            }
            else
            {
                System.out.println(num3 +" is greater then " + num1 + " and " + num2);
            }

            saan.close();

        }

            static void Count_Digits()
            {
                Scanner Con = new Scanner(System.in);

                int number; 
                int count = 0;

                System.out.println("Enter a number : ");
                number = Con.nextInt();

                while(number > 0)
                {

                    int result = number % 10;

                    count = count + 1;

                    number = number / 10;

                }
                System.out.println("The Number of Digits are : " + count);

            }

            void Count_Digits_Instance()
            {

                 Scanner Con = new Scanner(System.in);

                int number; 
                int count = 0;

                System.out.println("Enter a number : ");
                number = Con.nextInt();

                while(number > 0)
                {

                    int result = number % 10;

                    count = count + 1;

                    number = number / 10;

                }
                System.out.println("The Number of Digits are : " + count);

            }

            static void palindrome(){

                int number; 
                int Reverse = 0;
                int result;

                Scanner Palin = new Scanner(System.in);

                System.out.println("Enter the number : ");
                number = Palin.nextInt();

                int OrginalNumber = number;

                while(number > 0)
                {

                    result = number % 10;
                    Reverse = Reverse * 10 + result;
                    number = number / 10;


                }

                if(OrginalNumber == Reverse)
                {
                    System.out.println("It is a Palindrome : " + Reverse);
                }
                else
                {
                    System.out.println("It is not a Palindrome");
                }

            }


        
    
        
     public static void main(String[]args) 
    {

        // int a = 10, b = 20;
        // Sum(a, b);

        // MethodsAssignment obj1 = new MethodsAssignment();
        // obj1.ADD(10, 20);

        // int SquareNumber = Sqaure();
        // System.out.println("The Square Number is : " + SquareNumber);

        // MethodsAssignment obj2 = new MethodsAssignment();
        // int SqrNumber = obj2.SQUARE();
        // System.out.println("The Square Number is :  " + SqrNumber);

        // boolean result = Even();
        // System.out.println(result);

        // MethodsAssignment obj3 = new MethodsAssignment();
        // boolean res = obj3.EvenOrOdd();
        // System.out.println(res);

        // MaxOfThree();

        // MethodsAssignment obj4 = new MethodsAssignment();
        // obj4.MaxOfNumber();

        // Count_Digits();

        // MethodsAssignment obj5 = new MethodsAssignment();
        // obj5.Count_Digits_Instance();

        palindrome();
        


    }
}