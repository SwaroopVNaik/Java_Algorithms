public class AddingDigits 
{
    
    public static void main(String[] args) 
    {
        
        int number = 482; 

        System.out.println();

        int d1 = number / 100;

        System.out.println("The Digit 1 from "  + number + " is :"  + d1);

        System.out.println();

        int d2 = (number / 10) % 10;

        System.out.println("The Digit 2 from "  + number + " is :"  + d2);

        System.out.println();

        int d3 = number % 10;

        System.out.println("The Digit 3 from "  + number + " is :"  + d3);

        System.out.println();

        int result = d1 + d2 + d3;

        System.out.println("After adding all 3 digits the result is : " + result);

        System.out.println();

    }

}
