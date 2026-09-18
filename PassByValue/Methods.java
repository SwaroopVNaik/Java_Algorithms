package PassByValue;

public class Methods 
{

    // Pass by Reference
    static void makeItHalf(Pass myData)
    {
        myData.number = myData.number / 2;
    }

    // Pass by value

    static int makeItHalf_V1(int number)
    {
        return number = number / 2;
    }

    public static void main(String[] args) 
    {

        // Pass By Reference
        Pass newData = new Pass();
        newData.number = 200;

        makeItHalf(newData);
        System.out.println(newData.number);

        // Pass By Value 
        int number2 = 10;
        int number3 = makeItHalf_V1(number2);
        System.out.println(number3);

    }

}
