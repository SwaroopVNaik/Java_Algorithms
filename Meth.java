import java.util.Scanner;

public class Meth 
{   
        
    static void MaxOfThree()
    {

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

    }
    public static void main(String[]args)
    {
        MaxOfThree();
    }
        
}
