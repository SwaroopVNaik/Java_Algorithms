package VariableArguments;

public class EvenNumbers {

    int evenCount(int...even)
    {
        int count = 0;

        for(int number : even)
        {
            if(number%2 == 0)
            {
                count = count + 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        EvenNumbers obj = new EvenNumbers();

        System.out.println(obj.evenCount(10, 15, 20, 25, 30));

    }

}
