package For_Each_And_Arrays;

public class AverageForEach 
{

    int getAverage(int[] arr)
    {
        int Sum = 0;
        int result = 0;

        for(int number : arr)
        {
            Sum = (Sum + number);
            result = Sum / (arr.length - 1);
        }
        return result;
    }

    public static void main(String[] args) 
    {

        int[] arr = {10, 20, 30, 40, 50};

        AverageForEach obj = new AverageForEach();
        int sumOfArray = obj.getAverage(arr);

        System.out.println(sumOfArray);

    }

}
