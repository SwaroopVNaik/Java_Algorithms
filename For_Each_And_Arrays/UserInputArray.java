import java.util.Scanner;

public class UserInputArray {

    void getArrayElements(int[] numbers)
    {
        for(int number : numbers)
        {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Declaring the size of the array
        System.out.println("Enter the Size of an Array : ");
        int size = scanner.nextInt();

        // creating array
        int arr[] = new int[size];

        System.out.println("Enter "+ size + " Elements of the Array");

        // adding the element in the index of the array so use (normal for)
        for(int index = 0; index < size; index = index + 1)
        {
            arr[index] = scanner.nextInt();
        }

        UserInputArray obj = new UserInputArray();
        obj.getArrayElements(arr);
    }

}
