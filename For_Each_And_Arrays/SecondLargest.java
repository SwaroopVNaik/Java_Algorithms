public class SecondLargest 
{

    int getSecondLargest(int[] arr)
    {
        int firstHighest = 0;
        int secondLargest = 0;

        for(int number : arr)
        {
            if(number > firstHighest)
            {
                firstHighest = number;
            }
        }
        return secondLargest;
    }


    public static void main(String[] args) 
    {

        int arr[] = {42, 82, 11, 95, 23, 7, 56, 89, 4, 31, 67, 15, 73, 50, 61};

        SecondLargest obj = new SecondLargest();

        System.out.println(obj.getSecondLargest(arr));

    }

}
