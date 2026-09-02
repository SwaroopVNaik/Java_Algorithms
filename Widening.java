// demonstration of typecasting.
/* public class Widening 
{
    public static void main(String[] args) 
    {
        // Widening -> putting smaller data in larger datatype

        int num = 100;
        int result = num; // updating the variable

        System.out.println(result);

    }
} */


public class Widening 
{
    public static void main(String[] args) 
    {
        // Narrowing -> putting larger data in smaller datatype.

        int num = 100;
        byte result = (byte)num; // Typecasted => int -> byte 

        System.out.println(result);

    }
} 