package Methods_Practice;

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

        // Input Validation
        while(true)
        {
            System.out.println("Enter the Age ");
            int age = obj.nextInt();

            if(age > 0)
            {

                boolean result = isEligibleToVote(age);

                if(result == true)
                {
                System.out.println("YES");
                }
                else
                {
                System.out.println("NO");
                }
                break;

            }
            else
            {
                System.out.println();
                System.out.println("Entered Age : " + age);
                System.out.println("Enter a Valid Input Please");
                System.out.println();
            }
        }

        obj.close();

    }

}
