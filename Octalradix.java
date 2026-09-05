import java.util.*;

public class Octalradix 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        String number;

        System.out.println("Enter a Number : ");

        number = sc.next(); // - 127 --> word

        boolean octal = true; // assume that numbr is octal

        for(int i = 0; i <= number.length() - 1; i++)
        {
            char ch = number.charAt(i);
            if(ch < '0' || ch > '7')
            {
                octal = false;
                // break; // --> does not go to if else statement as it break the program flow 
            }
        }
        if(octal)
            {
                System.out.println("Yes it is octal and radix = 8");
            }
            else
            {
                System.out.println("IT is not octal");
            }


    }
}
