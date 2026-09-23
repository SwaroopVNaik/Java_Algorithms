import java.util.Scanner;

public class RepeatedNumbers 
{

    void countNumberOfOccurence(int[] arr,int key)
    {

        int Count = 0;

        for(int number : arr)
        {
            if(key == number)
            {
                Count = Count + 1;
            }
        }

        System.out.println("Times Repeated :" + Count);
    }

    public static void main(String[] args) 
    {

        Scanner scanner = new Scanner(System.in);

        int[] arr = {1, 3, 4, 7, 9, 9, 4, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 1, 1, 1, 1};

        RepeatedNumbers obj = new RepeatedNumbers();

        System.out.println("Enter the Number to check how many times the number repeats :");
        int key = scanner.nextInt();

        obj.countNumberOfOccurence(arr, key);
        

    scanner.close();
    }

}
