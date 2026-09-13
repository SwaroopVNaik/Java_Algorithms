package Assignments;

import java.util.*;

public class QuestionNine {

    void NoOfDays(String Month)
    {
        if(Month.equals("January") || 
           Month.equals("March") || 
           Month.equals("May") ||
           Month.equals("July")||
           Month.equals("August") ||
           Month.equals("October") ||
           Month.equals("December")
        )
        {
            System.out.println("31 Days");
        }
        else if(Month.equals("February"))
        {
            System.out.println("28 or 29 (Leap Year) Days");
        }
        else if(Month.equals("April") || 
                Month.equals("June")  ||
                Month.equals("September") ||
                Month.equals("November"))
        {
            System.out.println("30 days");
        }
        else
        {
            System.out.println("Invalid Input");
        }
    }

    static void Noofday(int MonthNumber){

        for(int index = MonthNumber; index == MonthNumber; index = index + 1)
        {
            for(int jindex = 1; jindex <= 31; jindex = jindex + 1){
                System.out.println(jindex);
            }
            System.out.println("Days of Month : " + MonthNumber);
        }

    }


    
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println(
            "January" + " " +
            "February" + " " +
            "March" + " " +
            "April" + " " +
            "May" + " " +
            "June" + " " +
            "July" + " " +
            "August" + " " +
            "September" + " " +
            "October" + " " +
            "November" + " " +
            "December"
        );
        System.out.println("Enter the Month to get number of Days : ");

        String Month = obj.next();

        QuestionNine obj1 = new QuestionNine();
        // obj1.NoOfDays(Month);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Month number to get Days : ");
        int MonthNumber = sc.nextInt();

        Noofday(MonthNumber);

        obj.close();
        sc.close();
    }

}
