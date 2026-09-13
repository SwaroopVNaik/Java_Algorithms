package Assignments;

import java.util.Scanner;

public class QuestionEleven {

    static void Power(int Base, int Exponent)
    {

        int result = 1;
        int Pow = 0;

        for(int index = 1; index <= Exponent; index = index + 1)
        {
            Pow = Base * result;
            result = Pow;
        }
        System.out.println(Pow);
    }
    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Base Number : ");
        int Base = obj.nextInt();

        System.out.println("Enter the Exponent Number : ");
        int Exponent = obj.nextInt();

        Power(Base, Exponent);

        obj.close();
    }

}
