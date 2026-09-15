package Assignments;

import java.util.*;

public class QuestionTwentyFive {

    static void UserLoginSystem()
    {

        int Attempts = 1;

        String Password = "";
        String UserName = "";

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the UserName");
        UserName = obj.next();

        System.out.println("Enter the Password");
        Password = obj.next();

        for(int index = 3; index >= Attempts; index = index - 1)
        {

            if(Password.equals("SVN1234") && UserName.equals("SWAROOPVNAIK"))
            {
                UserLogin();
                return;
            }
            else
            {
                System.out.println("Check Username or Password Try Again !" + index + " Attempts");

                System.out.println("Enter the UserName");
                UserName = obj.next();

                System.out.println("Enter the Password");
                Password = obj.next();

            }

        }

        System.out.println("3/3 Attempts Done. please Try after 48 Hours ! ");

    }

    static void UserLogin()
    {
        System.out.println("Loggined Successfully");
    }

    public static void main(String[] args) {
        
        UserLoginSystem();

    }

}
