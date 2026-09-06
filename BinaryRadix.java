import java.util.Scanner;

public class BinaryRadix{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String number;

        System.out.println("Enter a Number : ");

        number = sc.next(); // - 127 --> word

        boolean binary = true; // assume that number is Binary
        boolean octal = true; // assume that number is Octal
        boolean HexaDecimal = true; // assume that number is HexaDecimal
        boolean Decimal = true;

        for(int i = 0; i <= number.length() - 1; i++)
        {
            char ch = number.charAt(i);
            // Decimal Logic
            if(ch < '0' || ch > '1')
            {
                binary = false;
            }
            // Binary Logic
            if(ch < '0' || ch > '7')
            {
                octal = false;
                // break; // --> does not go to if else statement as it break the program flow 
            }
            // Octal Logic
             if (ch < '0' || ch > '9')
            {
                Decimal = false;
                // break; --> does not go to 
            }
            if((ch < '0' || ch > '9') && (ch < 'A' || ch > 'F') && (ch < 'a' || ch > 'f'))
            {
                HexaDecimal = false;
            }
        }

            if(binary)
                {

                 System.out.println("Yes it is Binary and radix = 2");

                }
            else if(octal)
                {
                    System.out.println("Yes it is Octal and radix = 8");
                }
            else if(Decimal)
                {
                    System.out.println("yes it is Decimal and radix = 10");
                }
            else if(HexaDecimal)
                {
                    System.out.println("yes it is HexaDecimal  and radix = 16");
                }
            else
                {

                System.out.println("Invalid operation");
                }

        sc.close();

    }

}