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
        }
        return SecondLargest;
    }


    public static void main(String[] args) 
    {

        int arr[] = {10, 15, 12, 19, 25, 18, 92, 100};

        SecondLargest obj = new SecondLargest();

        obj.getSecondLargest(arr);

    }

}
