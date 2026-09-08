import java.util.Scanner;

public class fibonnaci {
    public static void main(String[] args) {
        
        int number;

        Scanner FIB = new Scanner(System.in);

        System.out.println("Enter the number");
        number = FIB.nextInt();

        int a = 0;
        int b = 1;
        int c;

        System.out.println(a + "  " + b);

        for(int index = 0; index <= number - 2; index = index + 1 )
        {

            c = a + b;
            System.out.print(c + " ");

            // b in a 
            a = b;

            // a in b
            b = c;


        }




    }
}
