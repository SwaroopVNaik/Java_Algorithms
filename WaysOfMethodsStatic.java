 class ISMethods {

    // Static Method - > 1st type of method in java

    // 1) no Arguments, no return

    static void greet()
    {
        System.out.println("Hi");
    }

    // 2) Arguments , no return

    static void printSum(int a, int b)
    {
        System.out.println("Sum = " + (a + b));
    }

    // 3) no Arguments but return

    static int getNumber()
    {
        return 100;
    }

    // 4) Args and return both

    static int Max(int x, int y)
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }


    public static void main(String[] args) {

        // 1)
        greet();

        //  2)
        printSum(30, 30);

        // 3)
        int num = getNumber();
        System.out.println(num);

        // 4)
        int IntLarge = Max(100, 700);
        System.out.println(IntLarge);

        

    }
}
