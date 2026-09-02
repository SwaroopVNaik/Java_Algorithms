public class FourNumberTwo 
{

    public static void main(String[] args)
    {
        
        int a = 10;
        int b = 20;
        int c = 30;
        // int d = 45;

        System.out.println();
        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("c :" + c);
        // System.out.println("d :" + d);
        System.out.println();

        a = a + b + c;
        b = a - b - c;
        c = a - b - c;
        a = a - b - c;

        System.out.println();
        System.out.println("a :" + a);
        System.out.println("b :" + b);
        System.out.println("c :" + c);
        // System.out.println("d :" + d);
        System.out.println();
        
    }

}
