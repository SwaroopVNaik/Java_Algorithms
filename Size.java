public class Size 
{
        public static void main(String[] args) 
        {

        // only way to check the Size of datatypes in Java

        // int a;
        // System.out.println();
        // System.out.println("Range : " + Integer.MIN_VALUE);
        // System.out.println();
        // System.out.println("Range : " + Integer.MAX_VALUE);
        // System.out.println();
        // System.out.println("Range : " + Integer.SIZE);

        // Integer Overflow 
        // byte value = 127; 
        // System.out.println(value);
        // value++;
        // System.out.println(value);

        int x = 5;
        System.out.println(x);
        // converting nummber to binary (can be done only integer)
        System.out.println("Binary of x : " + Integer.toBinaryString(x));


        int x_1 = -5;
        System.out.println(x_1);
        //  5's -> 2's compliment of 5 gives -5 binary naumber 
        // converting nummber to binary (can be done only integer)
        System.out.println("Binary of x_1 : " + Integer.toBinaryString(x_1));


    }
}
