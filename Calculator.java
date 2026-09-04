import java.util.*;
public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String Operaters;
        int num1;
        int num2;


        System.out.println("1. ADD");
        System.out.println("2. SUB");
        System.out.println("3. MULTIPLICATION");
        System.out.println("3. DIVISON");
        System.out.println("2: MODULAS");
        System.out.println();
        System.out.print("Enter the Operation You Want to Perform :");
        Operaters = sc.next();

        System.out.println();

        System.out.println("Enter Num1 : ");
        num1 = sc.nextInt();

        System.out.println("Enter Num2 : ");
        num2 = sc.nextInt();

        switch(Operaters.toUpperCase()){
            case "ADD":
                System.out.println("The Addtion of num1 and num2 is : " + (num1 + num2));
                break;
            
            case "SUB":
                System.out.println("The Subtraction of num1 and num2 is : " + (num1 - num2));
                break;

            case "MULTIPLICATION":
                System.out.println("The Multiplcation of num1 and num2 is : " + (num1 * num2));
                break;

            case "DIVISON":
                System.out.println("The Division of num1 and num2 is : " + (num1 / num2));
                break;
            
            case "MODULAS":
                System.out.println("The Modulas of num1 and num2 is : " + (num1 % num2));
                break;

            default:
                System.out.println("You have entered a Invalid Input ! please do check your input");

        }
    }

}
