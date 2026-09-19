package Methods_Practice;

import java.util.Scanner;

public class MonthlyElectrcityBill 
{


    static float getMonthlyElectricityBill(int units, float perUnits)
    {
        return units * perUnits;
    }

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        // Input Validdation
        while(true)
        {
            System.out.println("Enter the Units : ");
            int units = obj.nextInt();

            System.out.println("Enter the price of perUnits : ");
            float perUnits = obj.nextFloat();

            // Input Validation 

            if((units >= 0) && (perUnits >= 0)){

                float amount = getMonthlyElectricityBill(units, perUnits);
                System.out.println("The Total Amount to be paid : " + amount);
                break;

            }
            else
            {
                System.out.println();

                System.out.println("Entered units : " + units);
                System.out.println("Entered perUnits : " + perUnits);
                System.out.println("Enter the Valid Inputs");
                
                System.out.println();

            }
            
        }

    obj.close();
    }

}
