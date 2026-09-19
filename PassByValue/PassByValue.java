package PassByValue;

public class PassByValue {

    static int number(int number)
    {
        return number * 2;
    }
    
    public static void main(String[] args) {

        int number = 10;

        System.out.println(number);
        int result = number(number);
        System.out.println(result);

    }

}
