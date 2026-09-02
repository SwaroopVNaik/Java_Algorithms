import java.util.*;

public class Scanadd 
{
    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        int a , b , Result;

        System.out.println("Enter the first Number : ");
        a = sc.nextInt();

        System.out.println("Enter the Second Number : ");
        b = sc.nextInt();

        Result = a + b;

        System.out.println("The Value of Addition is : "+Result);

    }
}
