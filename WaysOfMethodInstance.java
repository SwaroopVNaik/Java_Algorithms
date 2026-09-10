 class  WaysInstance{

    // Instance Method - > 2nd type of method in java

    // 1) no Arguments, no return

    void greet()
    {
        System.out.println("Hi");
    }

    // 2) Arguments , no return

    void printSum(int a, int b)
    {
        System.out.println("Sum = " + (a + b));
    }

    // 3) no Arguments but return

    int getNumber()
    {
        return 100;
    }

    // 4) Args and return both

    int Max(int x, int y)
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
        WaysInstance obj1 = new WaysInstance();
        obj1.greet();

        //  2)
        WaysInstance obj2 = new WaysInstance();
        obj2.printSum(30, 30);

        // 3)
        WaysInstance obj3 = new WaysInstance();
        int num = obj3.getNumber();
        System.out.println(num);

        // 4)
        WaysInstance obj4 = new WaysInstance();
        int IntLarge = obj4.Max(100, 700);
        System.out.println(IntLarge);
    }
}

 