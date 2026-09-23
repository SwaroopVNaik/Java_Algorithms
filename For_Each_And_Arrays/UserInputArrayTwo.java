import java.util.Scanner;

public class UserInputArrayTwo {

    void printArray(String[] numbers)
    {
        for(String number : numbers)
        {
            System.out.println(number);
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the array Size : ");
        int size = scanner.nextInt();

        String [] numbers = new String[size];

        System.out.println("Enter " + size + " Elements of the array");

        for(int index = 0; index <= size - 1; index = index + 1)
        {
            numbers[index] = scanner.next();
        }

        UserInputArrayTwo obj = new UserInputArrayTwo();
        obj.printArray(numbers);



    }

}
