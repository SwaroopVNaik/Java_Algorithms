public class Reverse 
{
    public static void main(String[] args) 
    {

        int number = 3456;

        System.out.println("Before Reversing the Number : " + number);

        // Two Number Logic 

        // int Lastdigit = number%10;

        // int Firstdigit = number/10;


        // Three Numbers Logic

        // int Lastdigit = number%10;

        // int MiddleDigit  = (number / 10) % 10;

        // int Firstdigit = number / 100;

        // Four Number Logic 

        int Lastdigit = number%10;

        int MiddleDigit = (number / 10) % 10;

        int MiddleDigit_2 = (number / 100) % 10;

        int Firstdigit = (number / 1000);

        int reverse = (Lastdigit * 1000) + (MiddleDigit * 100) + (MiddleDigit_2 * 10) + (Firstdigit);

        // int reverse = (Lastdigit * 100) + (MiddleDigit * 10) + (Firstdigit);

        System.out.println("After Reversing the Number : " + reverse);

    }
}
