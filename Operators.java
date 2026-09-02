public class Operators 
{
    public static void main(String[] args) 
    {
        
        int a = 10;
        int b = 20;

        System.out.println();

        System.out.println("Value1 : " + a);
        System.out.println("Value2 : " + b);

        System.out.println();

        // Arithmetic Operator (+, - , * , / , %)

       System.out.println("Arithemetic Operations (Binary Operations)"); 

        System.out.println("Addtion : " + (a + b));
        System.out.println();
        System.out.println("Substraction : " + (a - b));
        System.out.println();
        System.out.println("Multiplication : " + (a*b));
        System.out.println();
        System.out.println("Divison : " + (a/b));
        System.out.println();
        System.out.println("Modulas : " + (a%b));
        System.out.println();



        // Precedence 

        int number1 = (10 + 5 * 2);
        int number2 = ((10 + 5) * 2);
        int number3 = (20 - 5 + 2);
        int number4 =  ((20) - 5 + 2);

        System.out.println("Airthmetic Operations Precedence : ");
        System.out.println("Precedence Number1 :" + number1);
        System.out.println("Precedence Number1 :" + number2);
        System.out.println("Precedence Number1 :" + number3);
        System.out.println("Precedence Number1 :" + number4);

        // Boolean 

        boolean x = true;
        boolean y = false;

        System.out.println();

        System.out.println("Boolean Operations");

        System.out.println("Boolean : " + x);
        System.out.println("Boolean : " + y);

        System.out.println();
        System.out.println("Does not get operated cause in java Boolean returns true = true && false = false not 0 or 1");

        // boolean x + y;  --> gives the error since java return boolean as words true / false
        // boolean x * y; -->  gives the error since java return boolean as words true / false
        // boolean x - y; --> gives the error since java return boolean as words true / false
        // boolean x / y; --> gives the error since java return boolean as words true / false
        // Booelan x % y; --> gives the error since java return boolean as words true / false

        // Unary Operator 

        System.out.println();
        System.out.println("Unary Operations :");
        System.out.println();

        int z = 9;
        z++;
        System.out.println("Unary Operation Increment z++ : " + z);

        int q = 10; 
        q--;
        System.out.println("Unary Operation Decreement q-- : " + q);

        System.out.println();

        int n = 7; 
        ++n;
        System.out.println("Unary Operation Pre-Increment ++n " + n);

        int j = 2;
        --j;
        System.out.println("Unary Operation pre - Decrement " + j);

        System.out.println();

        double AA = 20.5f; 
        double BB = 3.6f;

        System.out.println("The double Modulus is : " + (AA%BB));

        System.out.println();

        float AAB = 20.5f; 
        float BBB = 3.6f;

        System.out.println("The float Modulus is : " + (AAB%BBB));

        System.out.println();

        int AABB = 20; 
        int BBBB = 3;

        System.out.println("The int Modulus  is : " + (AABB%BBBB));

        System.out.println();

        float m = 10678.778f;
        double o = 567889.789;

        double resultzzz = m/o;
         
        System.out.println(resultzzz);

        int val1 = 10;
        int val2 = 4;

        double res1 = val1 / val2; 

        double res2 = (double) val1 / val2;

        System.out.println("res1 = val1/val2 :" + res1);

        System.out.println("res1 = (double) val1/val2 :" + res2);

    }
}
