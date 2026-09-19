package Methods_Practice;

import java.util.Scanner;

public class BusFare {

    static double getBusFare(int age, double Kilometers)
    {

        int busServiceCharges = 10;
        int boardingCharges = 2;

        if(age >= 60)
        {
            return (busServiceCharges + Kilometers) * boardingCharges / 2;
        }
        else
        {
            return (busServiceCharges + Kilometers) * boardingCharges;
        }

    }

    
    public static void main(String[] args) 
    {

        Scanner obj = new Scanner(System.in);

        // Input Validation
        while(true)
        {
            
            System.out.println("Enter Your Age");
            int age = obj.nextInt();

            System.out.println("Enter Kilometers Travelled");
            double Kilometers = obj.nextDouble();

            if((age >= 1 && age <= 100) && (Kilometers >= 0))
            {
                if(age >= 60)
                {
                    System.out.println("Senior Citizen, 50% discount on Bus Fare");
                }
                double busFare = getBusFare(age, Kilometers);
                System.out.println("The Bus Fare is : " + busFare);
                break;
            }
            else
            {
                System.out.println();
                System.out.println("Please check kilometer and Age Inputs");
                System.out.println();
            }

        }

        obj.close();
    }

}
