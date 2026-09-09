public class  OneObjectManyMethods{

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

        OneObjectManyMethods obj1 = new OneObjectManyMethods();

        obj1.greet();

        obj1.printSum(10, 20);

        int c = obj1.getNumber();

        System.out.println(c);

        int d = obj1.Max(100, 200);

        System.out.println(d);

    }
}