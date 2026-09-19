package Functions_Practice;

import java.util.*;

public class Vote {

    static boolean isEligibleToVote(int age)
    {
        if(age >= 18)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Age ");
        int age = obj.nextInt();

        boolean result = isEligibleToVote(age);

        if(result == true)
        {
            System.out.println("Eligible to Vote : ");
        }
        else
        {
            System.out.println("Else not eligible to Vote : ");
        }


        obj.close();

    }

}
