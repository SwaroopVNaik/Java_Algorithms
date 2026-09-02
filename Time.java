public class Time 
{

    public static void main(String[] args)
    {

        int number = 4728;

        int d1 = number%10;

        System.out.println(d1);

        int d2 = (number / 10) % 10;

        System.out.println(d2);

        int d3 = (number / 100) % 10;

        System.out.println(d3);

        int d4 = (number / 1000) % 10;

        System.out.println(d4);

        // int result = (d1 * 1000) + (d2 * 100) + (d3 * 10) + d4;

        int result = d1 * d2 * d3 * d4;

        System.out.println(result);

        int num2 = 5836; 

        int FirstNumber = (num2 / 1000) % 10;

        System.out.println(FirstNumber);

        int num3 = 9274; 

        int secondNumber = (num3 / 100) % 10;

        System.out.println(secondNumber);


        int num4 = 8462;

        int firstnumber = (num4 / 1000) % 10; 

        System.out.println("firstNumber : "  + firstnumber);

        int second = (num4 / 100) % 10;

        System.out.println("Second Number : " + second);

        int res = firstnumber + second;

        System.out.println("res : " + res);



    }

}