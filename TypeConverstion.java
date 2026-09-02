public class TypeConverstion {
    public static void main(String[] args) {

        // Golden Rules :

        // Type Promotion : Automatic converstion of smaller datatype to larger datatype by java before performing an operation

        // if type promotion was not there then data was overflowing was occuring.

        // 1) byte , short and char are always promoted to int before arithmetic operation
        // 2) if operands are of different types , java promotes the smaller type to the widest type in expression
        // 3) the result of the expression is of that promoted type

        
        // demo of byte and byte 

        byte NUM1 = 10;
        byte NUM2 = 30;

        // byte result = NUM1 + NUM2 ---> Error (Lossy Converstion)

        int result = NUM1 + NUM2; // Type Promotion

        System.out.println("byte + byte = " + result);

        // demo of byte and short

        byte NUM3 = 4;
        short NUM4 = 2;

        // short result1 = NUM3 + NUM4; --> Error (Lossy Converstion)

        int result2 = NUM3 + NUM4; // Type Promotion

        System.out.println("byte + short = " + result2);

        // demo of byte + long 

        byte NUM5 = 5;
        long NUM6 = 4;

        // byte result3 = NUM5 + NUM6; --> Error (Lossy Converstion)

        long result3 = NUM5 + NUM6; // Type  promotion
        
        System.out.println("byte + long = " + result3);

        // Demo of Int to Int 

        int NUM7 = 6;
        int NUM8 = 6;

        int result4 = NUM7 + NUM8; // Type Promotion

        System.out.println("int + int = " + result4);

        // Demo of int to float 

        int NUM9 = 10;
        float NUM10 = 20;

        // int result5 = NUM9 + NUM10; --> Error (Lossy Converstion)

        float result5 = NUM9 + NUM10; // Type Promotion

        System.out.println("int + float = " + result5);

        // Demo of float to double

        float NUM11 = 50;
        double NUM12 = 50; 

        // float result6 = NUM11 + NUM12; --> Error (Lossy Converstion)

        double result6 = NUM11 + NUM12; // Type Promotion

        System.out.println("float + double = " + result6);

        //  demo of int to double 

        int NUM13 = 30;
        double NUM14 = 30;

        // int result7 = NUM13 + NUM14; --> error (Lossy Converstion)

        double result7 = NUM13 + NUM14; // Type Promotion

        System.out.println("int + double = " + result7);

        // demo long to double; 

        long NUM15 = 20;
        double NUM16 = 20;

        // long result8 = NUM15 + NUM16; --> error (Lossy Converstion)

        double result8 = NUM15 + NUM16; // Type Promotion

        System.out.println("long + double = " + result8);

        // demo char to int 

        char num = 'a';
        int num1 = 5;

        // char result9 = num + num1; Error (Lossy Converstion )

        int result9 = num + num1; // Type Promotion

        System.out.println("char + int = " + result9);

        // demo char to float 

        char num2 = 10;
        float num3 = 20;

        // char result10 = num2 + num3; Error (Lossy Converstion)

        float result10 = num2 + num3;

        System.out.println("char + float = " + result10);

        // demo char to double

        char num4 = 30;
        double num5 = 40;

        // char result11 = num4 + num4; Error (Lossy Converstion)

        double result11 = num4 + num5;

        System.out.println("char + double = " + result11);

        // demo of byte to int 

        byte num6 = 50;
        int num7 = 20;

        // byte result12 = num6 + num7; Error // Lossy converstion

        int result12 = num6 + num7;

        System.out.println("byte + int = " + result12);

        // demo byte to float 

        byte num8 = 30;
        float num9 = 50;

        // byte result14 = num8 + num9; --> Error (Lossy Converstion)

        float result14 = num8 + num9;

        System.out.println("byte + float = " + result14);

        // demo byte to double

        byte num10 = 20;
        double num11 = 60;

        // byte result15 = num10 + num11 --> Error (Lossy Converstion)

        double result15 = num10 + num11;

        System.out.println("byte + double = " + result15);

        //  demo short to short

        short num12 = 10;
        short num13 = 10; 

        // short result16 = num12 + num13; --> Error (Lossy Converstion)

        int result16 = num12 + num13;

        System.out.println("short + short = " + result16);

        // demo short and int 

        short num14 = 60;
        int num15 = 40;

        // short result17 = num14 + num15; --> Error (Lossy Converstion)

        int result17 = num14 + num15;

        System.out.println("short + int = " + result17);

        // demo short and long

        short num16 = 40;
        long num17 = 40;

        // short result18 = num16 + num17 --> Error (Lossy Converstion)

        long result18 = num16 + num17;

        System.out.println("short + long = " + result18);

        














    







    

        



    }
}
