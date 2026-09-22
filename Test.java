public class Test {
    public static void main(String[] args) {

        int[] arr = {2, 4, 6};

        // for (int x : arr) {
        //     x = x * x;
        // }

        int total = 0;

        for (int x : arr) {
            total += x;
        }

        System.out.println(total);
    }
}