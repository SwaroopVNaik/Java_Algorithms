package Assignments;
import java.util.Scanner;

public class PrimeNumber {

    void Prime(int number)
    {

        Boolean isPrime = true;
        int index = 2;
        while(index < number)
        {
            if(number % index == 0)
            {
                isPrime = false;
            }

            index = index + 1;
        }

        if(isPrime == true)
        {
            System.out.println(number + " is Prime");
        }
        else
        {
            System.out.println(number + " not prime");
        }

    }

    void GCD(int numA, int numB)
    {
        int Common_Divisors = 0;

        for(int index = 1; index <= numA ; index++)
        {
            if(numA % index == 0 && numB % index == 0 )
            {
                Common_Divisors = index;
            }
        }
        System.out.println(Common_Divisors);
    }

    public static void main(String[] args) {
        
        // Scanner obj1 = new Scanner(System.in);

        // System.out.println("Enter the number  : " );
        // int number = obj1.nextInt();

        // PrimeNumber obj2 = new PrimeNumber();
        // obj2.Prime(number);

        Scanner obj2 = new Scanner(System.in);

        System.out.println("Enter the Number A");
        int numA = obj2.nextInt();

        System.out.println("Enter the Number B");
        int numB = obj2.nextInt();

        int temp = 0;

        if(numA > numB)
        {
            temp = numA;
            numA = numB;
            numB = temp;
        }

        PrimeNumber GCDOBJ = new PrimeNumber();
        GCDOBJ.GCD(numA, numB);

        obj2.close();
    }

}
