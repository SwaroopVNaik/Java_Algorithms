import java.util.*;

public class SeptemberTwo 
{

    public static void main(String[] args) 
    {

        String S1;
        int choice;
        int Decimal;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Decimal");
        System.out.println("2. Binary");
        System.out.println("3. Octal");
        System.out.println("4. HexaDecimal");
        System.out.println("Select Your Choice : ");
        choice = sc.nextInt();

        System.out.println("Enter the Input to check the number system");
        S1 = sc.next();

        Decimal = Integer.parseInt(S1, 10);

        if(choice == 1)
        {
            System.out.println(Decimal);
        }
        else if (choice == 2)
        {
            System.out.println("The Binary Number is : " + Integer.toBinaryString(Decimal));
        }
        else if(choice == 3)
        {
            System.out.println("The Octal Number is " + Integer.toOctalString(Decimal));
        }
        else if(choice == 4)
        {
           System.out.println("The HexaNumber is : " + Integer.toHexString(Decimal).toUpperCase());
        }
        else{
            System.out.println("Invalid Choice");
        }

    }

}
