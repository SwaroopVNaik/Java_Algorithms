public class DefaultValues 
{
    
    // Checking default values of primitive data types 
        
        static byte a;
        static short b;
        static int c;
        static long d;
        static float e;
        static double f;
        static char g;
        static boolean h;

        static String str;
        static int[] arr;

        // static belongs to class not the main 

        public static void main(String[] args) {

            System.out.println("_______Deafult Values Of Primitive DataTypes in Java_______");
            System.out.println("The inbuilt datatype is called as Primitive datatype");
            System.out.println();
            
            System.out.println("byte    = " + a);
            System.out.println("short   = " + b);
            System.out.println("int     = " + c);
            System.out.println("long    = " + d);
            System.out.println("float   = " + e);
            System.out.println("double  = " + f);
            System.out.println("char    = " + (int) g);
            System.out.println("boolean = " + h);
            System.out.println("String = " + str);
            System.out.println("int[] = " + arr);

        }
    
}
