
public class ConvertingSeconds 
{

    public static void main(String[] args) 
    {

        int Seconds = 3600;

        // converting seconds into hours : 

        // using / we need how many hours in 3600 we are dividing
        int Hours = Seconds / 3600; 

        // using % we need Remainder
        int Minutes = (Seconds % 3600)  / 60; 

        // using % we need Remainder
        Seconds = Seconds % 60; 

        System.out.println();

        System.out.println("The Hours is : " + Hours);

        System.out.println();

        System.out.println("The Minutes is :" + Minutes);

        System.out.println();

        System.out.println("The Seconds is : " + Seconds);

        System.out.println();

    }

}