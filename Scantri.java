import java.util.*;

public class Scantri
{
    public static void main(String[] args) 
    {
    
        Scanner sc = new Scanner(System.in);

        int h, b; 

        System.out.println("Enter the Base : ");
        b = sc.nextInt();

        System.out.println("ENter the Height");
        h = sc.nextInt();

        int result = b * h / 2;

        System.out.println("the area of tringle is : " + result);

    }
}
