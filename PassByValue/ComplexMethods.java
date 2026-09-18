package PassByValue;
public class ComplexMethods {

    public static void makeItHalf(int number)
    {
        number = number / 2;

    }

    public static int makeItHalf_V2(int number2)
    {

        return number2 = number2 / 2;

    }

    public static  void makeItHalf(Data myData)
    {
        myData.number = myData.number / 2;
    }

    // Write a function the takes an array as input and returns back the even numbers of Array as ouput !

    

    public static void main(String[] args) {

        int number = 10;
        // makeItHalf(number);
        // System.out.println(number);

        // int number2 = 10;
        // number2 = makeItHalf_V2(number2);
        // System.out.println(number2);

        Data newData = new Data();
        newData.number = 100;

        makeItHalf(newData);
        System.out.println(newData.number);


    }

}
