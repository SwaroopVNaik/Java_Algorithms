public class MemorySwap{
    public static void main(String[] args){
        
        int temp;
        int value1 = 5;
        int value2 = 0;
        int value3 = 3;
        int value4 = 7; 

        System.out.println();

        System.out.println("____________________Three Number Swapping____________________");

        System.out.println();
        System.out.println("value1 before Swapping : " + value1);
        System.out.println();
        System.out.println("value2 before Swapping :  " + value2);
        System.out.println();
        System.out.println("value3 before Swapping : " + value3);
        System.out.println();

        // logic - Three Number Swapping using Memory

        temp = value1;
        value1 = value2;
        value2 = value3;
        value3 = temp;

        System.out.println();
        System.out.println("value1 After Swapping : " + value1);
        System.out.println();
        System.out.println("value2 After Swapping :  " + value2);
        System.out.println();
        System.out.println("value3 After Swapping : " + value3);
        System.out.println();

        System.out.println("____________________Four Number Swapping____________________");

        System.out.println();
        System.out.println("value1 before Swapping : " + value1);
        System.out.println();
        System.out.println("value2 before Swapping :  " + value2);
        System.out.println();
        System.out.println("value3 before Swapping : " + value3);
        System.out.println();
        System.out.println("value4 before Swapping : " + value4);
        System.out.println();

        // Logic - Four Number Swapping using Memory
        temp = value1; 
        value1 = value2;
        value2 = value3;
        value3 = value4;
        value4 = temp;

        System.out.println();
        System.out.println("value1 after Swapping : " + value1);
        System.out.println();
        System.out.println("value2 after Swapping :  " + value2);
        System.out.println();
        System.out.println("value3 after Swapping : " + value3);
        System.out.println();
        System.out.println("value4 after Swapping : " + value4);
        System.out.println();

    }
}