public class Hw_2 {
    public static void main(String[] args) {
        // Write code to swap all the methods addition, division, XoR 

        //  By Adding
        int swapNumber_1 = 10; 
        int swapNumber_2 = 20;

        // System.out.println("Using Addition ");

        System.out.println();
        System.out.println("swapNumber_1 before swapping : " + swapNumber_1);
        System.out.println("swapNumber_2 before swapping :" + swapNumber_2);

        // Addition Logic
        // swapNumber_1 = swapNumber_1 + swapNumber_2; // 40 
        // swapNumber_2 = swapNumber_1 - swapNumber_2; // 10
        // swapNumber_1 = swapNumber_1 - swapNumber_2; // 30 

        // System.out.println("Using Division : ");

        // // Division Logic 
        // swapNumber_1 = swapNumber_1 / swapNumber_2; // 2
        // swapNumber_2 = swapNumber_1 * swapNumber_2; // 10
        // swapNumber_1 = swapNumber_2 / swapNumber_1; // 5

        System.out.println();

        System.out.println("Using XOR : ");

        // XOR Logic 
        swapNumber_1 = swapNumber_1 ^ swapNumber_2; // 30 => 11110
        swapNumber_2 = swapNumber_1 ^ swapNumber_2; // 10 => 01010
        swapNumber_1 = swapNumber_1 ^ swapNumber_2; // 20 => 10100


        System.out.println();
        System.out.println("SwapNumber_1 after Swapping : " + swapNumber_1);
        System.out.println("SwapNumber_2 after Swapping : " + swapNumber_2);

        System.out.println();

    }
}
