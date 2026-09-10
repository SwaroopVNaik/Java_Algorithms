import java.util.*;

import javax.print.attribute.standard.OrientationRequested;
public class MethodStaticVoid 
{

    // static void

    // Program 1 

    static void CheckEvenOdd(int n)
    {

        if(n % 2 == 0)
        {
            System.out.println("it is a Even number");
        }
        else
        {
            System.out.println("It is a Odd  number");
        }

    }

    // static non void

    // Program 2

    static boolean isEven(int n)
    {
        return n % 2 == 0;
    }

    // Instance void

    // Program 3

    void CheckEvenOrODD(int n){

        if(n % 2 == 0)
        {
            System.out.println("The Number is Even");
        }
        else
        {
            System.out.println("The Number is Odd");
        }
    }

    // instance non void

    // Program 4
    Boolean issEVEN(int n)
    {
        return n % 2 == 0;
    }


    // Program 5
    static int Sum(int a , int b)
    {

        return a + b;

    }

    // Program 6 
    static void SUM(int A, int B)
    {

        int C = A + B;
        System.out.println("Printing from Instance Method " + C);

    }

    // Program 7
    int ADD(int a, int b)
    {
        return a + b;
    }

    // program 8 

    void add(int a, int b)
    {
        int c = a + b;
        System.out.println(c);
    }

    // program 9

    static int Sqaure(int sqr)
    {

        return sqr * sqr;
    }

    // program 10
    static void SQR(int sqr){

        int result = sqr * sqr;
        System.out.println(result);

    }

    // Program 11 

    int sqrrrr(int sqr){

        return sqr * sqr;
    }

    // Program 12

    void SRR(int sqr)
    {
        Scanner CG = new Scanner(System.in);

        int SQAURE = sqr * sqr;
        System.out.println(SQAURE);
    }

    // program 13 

    static void MAXMAX(int num1, int num2, int num3)
    {

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

    }

    // program 14

    static int MAX(int num1, int num2, int num3)
    {

        if( (num1 > num2) && (num1 > num3) )
        {   
            return num1;
        }
        else if((num2 > num1) && (num2 > num3))
        {
            return  num2;
        }
        else
        {
            return num3;
        }

    }

    // program 15 

    void MAXMAX1(int num1, int num2, int num3)
    {

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

    }

    // Program 16 

    int MAXMAX2(int num1, int num2, int num3)
    {

         if( (num1 > num2) && (num1 > num3) )
            {
                return num1;
            }
            else if((num2 > num1) && (num2 > num3))
            {
                return num2;
            }
            else
            {
                return  num3;
            }

    }

    // Program 17 

    static void contuu(int number)
    {

        int Count = 0;

        while(number > 0)
        {
            int Digit = number % 10;

            Count  = Count + 1;

            number = number / 10;

        }

        System.out.println("The length of the Number is : " + Count);
    }

    // Program 18

    static int cos(int number)
    {

        int count = 0;

        while(number > 0)
        {
            int Digit = number % 10;

            count  = count + 1;

            number = number / 10;

        }
        return count;

    }

    // program 19

    void Tan(int number)
    {

        int Count = 0;

        while(number > 0)
        {
            int Digit = number % 10;

            Count  = Count + 1;

            number = number / 10;

        }

        System.out.println("The length of the Number is : " + Count);
    }

    // program 20

    int tan(int number)
    {

        int Count = 0;

        while(number > 0)
        {
            int Digit = number % 10;

            Count  = Count + 1;

            number = number / 10;

        }

        return Count;
    }

    // Program 21

    static Boolean SIN(int number)
    {
        int Reverse = 0;
        
        int OrginalNumber = number;

        while(number > 0)
        {
            int Digit = number % 10;

            Reverse = Reverse * 10 + Digit;

            number = number / 10;
        }

        if(OrginalNumber == Reverse)
        {
            return true;
        }
        else
        {
            
            return false;
        }

    }

    // program 22

    static void Omega(int number)
    {
        int Reverse = 0;
        
        int OrginalNumber = number;

        while(number > 0)
        {
            int Digit = number % 10;

            Reverse = Reverse * 10 + Digit;

            number = number / 10;
        }

        if(OrginalNumber == Reverse)
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            
            System.out.println("it is not a palindrom");
        }

    }

    // program 23 

    Boolean Omega3(int number)
    {
        int Reverse = 0;
        
        int OrginalNumber = number;

        while(number > 0)
        {
            int Digit = number % 10;

            Reverse = Reverse * 10 + Digit;

            number = number / 10;
        }

        if(OrginalNumber == Reverse)
        {
            return true;
        }
        else
        {
            
            return false;
        }
    }

    // Program 24 

    void Omega7(int number)
    {
        int Reverse = 0;
        
        int OrginalNumber = number;

        while(number > 0)
        {
            int Digit = number % 10;

            Reverse = Reverse * 10 + Digit;

            number = number / 10;
        }

        if(OrginalNumber == Reverse)
        {
            System.out.println("it is a palindrome");
        }
        else
        {
            
            System.out.println("it is not a palindrom");
        }

    }



    public static void main(String[] args) 
    {

        // Take input and call =
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number");
        // int n = sc.nextInt();

        // When function is not returning anything no need to store it in a variable

        // Program 1
        // CheckEvenOdd(n);

        // Program 2
        // boolean result = isEven(n);
        // System.out.println(result);

        // if(result)
        // {
        //     System.out.println("Even Number");
        // }
        // else
        // {
        //     System.out.println("Odd Number");
        // }


        // Program 3
        // MethodStaticVoid obj1 = new MethodStaticVoid();
        // obj1.CheckEvenOrODD(n);

        // Program 4
        // MethodStaticVoid obj2 = new MethodStaticVoid();
        // boolean result = obj2.issEVEN(n);

        // System.out.println(result);

        // if(result)
        // {
        //     System.out.println("the number is even");
        // }
        // else 
        // {
        //     System.out.println("The number is odd");
        // }

        // Program 5

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the Number A : ");
        // int a = sc.nextInt();

        // System.out.println("Enter the Number B : ");
        // int b = sc.nextInt();

        // Sum(a, b);

        // Program 6

        // SUM(a, b);

        // Program 7

        // MethodStaticVoid obj2 = new MethodStaticVoid();
        // int result = obj2.ADD(a, b);

        // System.out.println(result);

        // Program 8 

        // MethodStaticVoid obj3 = new MethodStaticVoid();
        // obj3.add(a, b);

        // program 9 

        // Scanner SQ = new Scanner(System.in);

        // System.out.println("Enter the number to find the Sqaure : ");
        // int sqr = SQ.nextInt();
        
        // int result = Sqaure(sqr);

        // System.out.println(result);

        // Program 10 

        // SQR(sqr);

        // Program 11 

        // MethodStaticVoid obj3 = new MethodStaticVoid();
        // int result = obj3.sqrrrr(sqr);

        // System.out.println(result);

        // program 12

        // MethodStaticVoid obj4 = new MethodStaticVoid();
        // obj4.SRR(sqr);

        // Program 13 

        // Scanner MAXU = new Scanner(System.in);

        // System.out.println("Enter Number 1 :");
        // int num1 = MAXU.nextInt();

        // System.out.println("Enter Number 2 :");
        // int num2 = MAXU.nextInt();

        // System.out.println("Enter Number 3 :");
        // int num3 = MAXU.nextInt();

        // MAXMAX(num1, num2, num3);

        // Program 14

        // Scanner MAXu = new Scanner(System.in);

        // System.out.println("Enter Number 1 :");
        // int num1 = MAXu.nextInt();

        // System.out.println("Enter Number 2 :");
        // int num2 = MAXu.nextInt();

        // System.out.println("Enter Number 3 :");
        // int num3 = MAXu.nextInt();

        // int result = MAX(num1, num2, num3);

        // System.out.println("The maximum is : " + result);

        // Program 15 

        // Scanner Maxu = new Scanner(System.in);

        // System.out.println("Enter Number 1 :");
        // int num1 = Maxu.nextInt();

        // System.out.println("Enter Number 2 :");
        // int num2 = Maxu.nextInt();

        // System.out.println("Enter Number 3 :");
        // int num3 = Maxu.nextInt();

        // MethodStaticVoid obj5 = new MethodStaticVoid();
        // obj5.MAXMAX1(num1, num2, num3);

        // program 16 

        // Scanner Maxu = new Scanner(System.in);

        // System.out.println("Enter Number 1 :");
        // int num1 = Maxu.nextInt();

        // System.out.println("Enter Number 2 :");
        // int num2 = Maxu.nextInt();

        // System.out.println("Enter Number 3 :");
        // int num3 = Maxu.nextInt();

        // MethodStaticVoid obj6 = new MethodStaticVoid();
        // int result = obj6.MAXMAX2(num1, num2, num3);

        // System.out.println("The Maximum is : " + result);

        // Program 17

        // Scanner countuu = new Scanner(System.in);

        // System.out.println("Enter the number : ");
        // int number = countuu.nextInt();

        // contuu(number);

        // program 18

        // Scanner countuu = new Scanner(System.in);

        // System.out.println("Enter the number : ");
        // int number = countuu.nextInt();

        // int result = cos(number);

        // System.out.println("the number of digit is : " + result);

        // program 19 

        // Scanner countuu = new Scanner(System.in);

        // System.out.println("Enter the number : ");
        // int number = countuu.nextInt();

        // MethodStaticVoid obj7 = new MethodStaticVoid();
        // obj7.tan(number);

        // Program 20 

        // Scanner countuu = new Scanner(System.in);

        // System.out.println("Enter the number : ");
        // int number = countuu.nextInt();

        // MethodStaticVoid obj8 = new MethodStaticVoid();
        // int result = obj8.tan(number);

        // System.out.println("the number of digit is : " + result);

        // Program 21 

        // Scanner SOON = new Scanner(System.in);

        // System.out.println("Enter thr number to check palin or not : ");
        // int number = SOON.nextInt();

        // Boolean result = SIN(number);

        // System.out.println("The number is : " + result);

        // program 22

        // Scanner SOONN = new Scanner(System.in);

        // System.out.println("Enter thr number to check palin or not : ");
        // int number = SOONN.nextInt();
        // Omega(number);

        // program 23 

        // Scanner SOON = new Scanner(System.in);

        // System.out.println("Enter thr number to check palin or not : ");
        // int number = SOON.nextInt();

        // MethodStaticVoid OM = new MethodStaticVoid();
        // Boolean result = OM.Omega3(number);

        // System.out.println("The number is palindrome : " + result);

        // Program 24
        
        Scanner SOON = new Scanner(System.in);

        System.out.println("Enter thr number to check palin or not : ");
        int number = SOON.nextInt();

        MethodStaticVoid OM = new MethodStaticVoid();
        OM.Omega7(number);



















    }

}
