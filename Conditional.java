import java.util.*;

public class Conditional 
{

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        // int age; 
        // boolean citizen;

        // System.out.print("Enter your Age : ");
        // age = sc.nextInt();

        // System.out.println("Indian Citizenship : True / False ");
        // citizen = sc.nextBoolean();

        // if(age == 18){
        //     // if block 
        //     System.out.println("yes ! eligible to Vote");

        // } else{

        //     // Not eligible to vote 
        //     System.out.println("Not Eligible");

        // }

        // if else if 

        // if(age == 18)
        // {
        //     // if block 
        //     System.out.println("yes ! eligible to Vote");

        // }
        // else if (age < 18 && age > 0) 
        // {
        //     // Not eligible to vote 
        //     System.out.println("Not Eligible");

        // }
        // else
        // {
        //     System.out.println("Invalid");
        // }
        

        // Nested if 

        // if(age >= 18){
        //     if (citizen){

        //         System.out.println("Eligible");

        //     }
        //     else{
        //         System.out.println("Not Eligible");
        //     }
        // } else {

        //     System.out.println("Age less then 18");

        // }

        // Switch : 

        // int Days;

        // System.out.println("Enter the day numbers : ");
        // Days = sc.nextInt();

        // switch(Days)
        // {
        //     case 1:
        //         System.out.println("Sunday");
        //         break;

        //     case 2 :
        //         System.out.println("Monday");
        //         break;

        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
            
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;

        //     case 5:
        //         System.out.println("Thursday");
        //         break;

        //     case 6:
        //         System.out.println("Friday");
        //         break;

        //     case 7:
        //         System.out.println("Saturday");
        //         break;

        //     default:
        //         System.out.println("Inavalid Input please do enter valid Input");

        // }

        // Switch (voting using switch and ternary operator)

        // System.out.println("Enter Your age : ");
        // age = sc.nextInt();


        // String result = (age >= 18) ? "YES" : "NO";

        // switch(result){

        //     case "YES" :
        //         System.out.println("Elegible");
        //         break;

        //     case "NO" :
        //         System.out.println("Not Elegible");
        //         break;
            
        // }

        // swtich combine condiotn

        System.out.println("combine the conditons");

        int age = 20; 
        boolean citizen = true;

        System.out.println("enter your age :");
        age = sc.nextInt();

        if(age >= 18 && citizen) 
        {
            System.out.println("eligible to vote");
        }
        else
        {
            System.out.println("not eligible to vote");
        }

    }

}
