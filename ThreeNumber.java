public class ThreeNumber 
{
    public static void main(String[] args) 
    {
        
        // Three Number Swap 

        int Value1 = 10 ; // c
        int Value2 = 20 ; // b
        int Value3 = 30 ; // a

        System.out.println();
        System.out.println("Value1 before Swapping : " + Value1);
        System.out.println();
        System.out.println("Value2 before Swapping :  " + Value2);
        System.out.println();
        System.out.println("Value3 before Swapping : " + Value3);

        // Logic - Three Number
        
        // Method - 1 
        // Value1 = Value1 + Value2 + Value3; 
        // Value2 = Value1 - Value2 - Value3;
        // Value3 = Value1 - Value2 - Value3;
        // Value1 = Value1 - Value2 - Value3;

        // Method - 2 
        Value1 = Value1 + Value2 + Value3; // 60 
        Value2 = Value1 - Value2 - Value2; // 20
        Value3 = Value1 - Value3; // 30 
        Value1 = Value2 + Value3 - Value1; // 10 



        System.out.println();

        System.out.println("____________After Swapping______________");

        System.out.println();
        System.out.println("Value1 after Swapping : " + Value1);
        System.out.println();
        System.out.println("Value2 after Swapping :  " + Value2);
        System.out.println();
        System.out.println("Value3 after Swapping : " + Value3);

    }
}
