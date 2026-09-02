public class FourNumber 
{
    public static void main(String[] args) 
    {

        // Four Number Swap 

        int Value1 = 10;
        int Value2 = 20;
        int Value3 = 30; 
        int Value4 = 40;


        System.out.println();
        System.out.println("Value1 before Swapping : " + Value1);
        System.out.println();
        System.out.println("Value2 before Swapping :  " + Value2);
        System.out.println();
        System.out.println("Value3 before Swapping : " + Value3);
        System.out.println();
        System.out.println("Value4 before Swapping : " + Value4);

        // Logic - Four Number
        Value1 = Value4 - Value2; // 20 
        Value2 = Value3 + Value2; // 50
        Value3 = Value2 - Value4; // 10
        Value4 = Value4 - Value3; // 30
        Value2 = Value2 - Value3; // 40

        System.out.println();

        System.out.println("____________After Swapping______________");

        System.out.println();
        System.out.println("Value1 after Swapping : " + Value1);
        System.out.println();
        System.out.println("Value2 after Swapping :  " + Value2);
        System.out.println();
        System.out.println("Value3 after Swapping : " + Value3);
        System.out.println();
        System.out.println("Value4 after Swapping : " + Value4);

        // System.out.println(Value1.getClass().getName());

        // Character ch = '4';

        // System.out.println(ch.getClass().getName());



    }

}

