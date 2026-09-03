import java.util.*;

public class leapyear {

    public static void main(String[] args) 
    {
        
        // The Syntax of Nested if Loops

        // if(conditon){
        //     if(conditon){
        //         if(conditon){

        //             // Code

        //         }
        //         else
        //             {

        //                 // code 

        //             }
        //     }
        //     else
        //         {

        //             // Code

        //         }
        // }
        // else{

        //     // Code

        // }

        int LeapYear;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year to check Leap Year : ");
        LeapYear = sc.nextInt();

        if(LeapYear % 4 == 0)
            {
                if(LeapYear % 100 == 0)
                    {
                        if(LeapYear % 400 == 0)
                        {
                            System.out.println("Leap Year");
                        }
                        else
                            {
                                System.out.println("It is not a Leap Year");
                            }
                    }
                    else
                    {
                        System.out.println("It is not a Leap Year");
                    }
            } 
            else
            {
                System.out.println("Not a Leapp year");
            }   
    }            
        
}