import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        // int arr[5]; -> Wrong Declaration 

        int arr [] = new int[5]; // Array Declare

        System.out.println(arr); // Hash Value
        System.out.println(Arrays.toString(arr)); // Default Value

        int arr1 [] = {10, 20 , 30};

        System.out.println(arr1); // Hash Value 

        System.out.println(Arrays.toString(arr1)); // Value [10, 20, 30]

        int arr2 [] = new int [] {11, 22 , 33}; // Arr initialization

        System.out.println(arr1); // Hash Value 

        System.out.println(Arrays.toString(arr2)); // Value [10, 20, 30]
    }
}
