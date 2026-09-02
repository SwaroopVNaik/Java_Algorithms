public class Demo{
    public static void main(String[] args){
        // 1) Take variable and store sum value and print it (varible name age)
        int value = 22;
        System.out.println("The value is : " + value);
        value = 30;
        System.out.println("The 2nd Value is : " + value);

        // 2) Addition : 
        byte Num_1 = 10;
        byte Num_2 = 20;
        int total = Num_1 + Num_2;

        System.out.println("The Addtion on two number 10 and 20 is : " + total);

        // 3) Copy value :
        int Number_1 = 400; 
        int Number_2 = Number_1; 
        System.out.println("The Value of Number_2 is : " + Number_2);

        // 4) Update Variable : 
        int NO_1 = 10;
        int NO_2 = NO_1; 
        System.out.println("The NO_1 value copied into NO_2 : " + NO_2);
        NO_2 = 50; 
        System.out.println("The Updated Value of NO_2 : " +  NO_2);

        // 5) Swap Number 
        int swapNumber_1 = 10;
        int swapNumber_2 = 20;
        int temp; // temporary variable

        System.out.println("Before Swapping Number_1 : " + swapNumber_1);
        System.out.println("Before Swapping Number_2 : " + swapNumber_2);

        temp = swapNumber_1;
        swapNumber_1 = swapNumber_2;
        swapNumber_2 = temp; 

        System.out.println("Number_1 value after swapping : " + swapNumber_1);
        System.out.println("Number_2 value after swapping : " + swapNumber_2);
        
        // Byte : 
        byte NUM_1 = (byte) 30;
        System.out.println(NUM_1);
        
    }
}