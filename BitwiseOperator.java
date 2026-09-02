public class BitwiseOperator 
{
    
    public static void main(String[] args) 
    {
        
        int x = 10;
        int y = 6;


        System.out.println("And : " + (x & y));
        System.out.println();
        System.out.println("OR : " + (x | y));
        System.out.println();
        System.out.println("XOR : " + (x ^ y));
        System.out.println();
        System.out.println("NOT X : " + (~x));
        System.out.println();
        System.out.println("NOT Y : " + (~y));

        System.out.println();
        System.out.println("Left Shift");

        System.out.println();

        // Left Shift

        int a = 10;

        System.out.println("Left Shift by 1 place : " + (a << 1));
        System.out.println();
        System.out.println("Left Shift by 2 place : " + (a << 2));
        System.out.println();
        System.out.println("Left Shift by 3 place : " + (a << 3));

        System.out.println();

        System.out.println("Right Shift");
        System.out.println();
        System.out.println("Right shift is also called as signed Right shit");

        System.out.println();

        // Right Shift

        int b = -10;

        System.out.println("Right Shift by 1 : place " + (b >> 1));
        System.out.println();
        System.out.println("Right Shift by 2 : place " + (b >> 2));
        System.out.println();
        System.out.println("Right Shift by 3 : place " + (b >> 3));
        System.out.println();

        System.out.println("Right shift is also called as unsigned Right shit");

        System.out.println();

        System.out.println("For Right shift unsigned >>>");
        System.out.println();

        // Unsinged Right Shift

        int c = -10;

        System.out.println("Right Shift by 1 place : " + (c >>> 1));
        System.out.println();
        System.out.println("Right Shift by 2 place : " + (c >>> 2));
        System.out.println();
        System.out.println("Right Shift by 3 place : " + (c >>> 3));
        System.out.println();

    }

}
