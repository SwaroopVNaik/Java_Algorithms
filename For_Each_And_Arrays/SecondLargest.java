package For_Each_And_Arrays;

public class SecondLargest 
{

    int getSecondLargest(int[] arr)
    {
        int FirstHighest = arr[0];
        int SecondLargest = arr[0];

        for(int number : arr)
        {
            if(number > FirstHighest)
            {
                SecondLargest = FirstHighest;
                FirstHighest = number;
            }
            else if(number > SecondLargest && number != FirstHighest)
            {
                SecondLargest = number;
            }
        }
        return SecondLargest;
    }


    public static void main(String[] args) 
    {

        int arr[] = {20, 40, 52, 45, 20, 52};

        SecondLargest obj = new SecondLargest();

        System.out.println(obj.getSecondLargest(arr));

    }

}
