package CurosityCode;

public class Main {
    public static void main(String[] args) {

        // Data arrays to supply parameters
        int[] itemIds = {101, 102, 103};

        int[] quantities = {3, 5, 2, 4};

        // Loop passes a pair of parameters to the method on each iteration
        for (int i = 0; i < itemIds.length; i++) {

            processOrder(itemIds[i], quantities[i]);

        }
    }

    // Method defined with multiple fixed parameters
    public static void processOrder(int id, int qty) {

        System.out.println("Processing Item ID: " + id + " | Quantity: " + qty);

    }
}

