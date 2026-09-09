public class Methods {


    // Static method - method belongs to class no need of object
    // void method no return type (void return type)
    /* static void display(){

        System.out.println("Hello");

    }

    // 

    public static void main(String[] args) {

        display(); // method calling

    } */


    // Demo of non - void return type 

    static int MAX(int x, int y) // x = 10, y = 15 -- recive data -- formal parameter
    {

        if(x > y) // compare 10 > 15
        {
            return x;
        }
        else
        {
            return y; // return 15


            // scope checking

            // System.out.println(a); --> a is not in this method
        }

    }


    public static void main(String[] args) {

        int a = 10, b = 15; // a = 10 , x = 10 
        // -- parameter passing -- send data -- actual parameters (original values / inputs)

        // method calling
        int c = MAX(a, b); // calling method and passing value

        System.out.println(c);

        // System.out.println(y); --> y is not in this method

    }
}
