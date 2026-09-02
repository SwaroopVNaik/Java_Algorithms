import java.util.Scanner;

public class Conditiontwo 
{
    public static void main(String[] args) 
    {
        

        // Assignment - 1

        // int marks;
        // boolean passed_exam = true;
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter Your Marks : ");
        // marks = sc.nextInt();

        // System.out.println("Have You cleared all the exam (True / False) ");
        // passed_exam = sc.nextBoolean();

        // if( marks >= 85 && passed_exam == true)
        // {
        //     System.out.println("COngratulations ! on Securing Admmission in Algorithms365");
        // }
        // else 
        // {
        //     System.out.println("Not eligible for college Admission");
        // }

        // Assignment - 2

        String Day;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Day");
        Day = sc.next();

        if(Day.equals("Saturday") || Day.equals("Sunday"))
        {
            System.out.println("Happy Weekend !");
        }
        else if (Day.equals("Monday") 
                || Day.equals("Tuesday") 
                || Day.equals("Wednesday") 
                || Day.equals("Thursday") 
                || Day.equals("Friday"))
        {
            System.out.println("Go to work");
        }
        else 
        {
            System.out.println("Invalid input");
        }
        

        // Assignment - 3 

        // String Username;
        // String Password; 

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter The Username and Password to Login The database");

        // System.out.println("Username : ");
        // Username = sc.next();

        // System.out.println("Password :");
        // Password = sc.next();

        // if(Username.equals("SwaroopVNaik") && Password.equals("@LessGO123"))
        // {
        //     System.out.println("Valid User");
        // }
        // else
        // {
        //     System.out.println("Invalid User");
        // }

    }
}
