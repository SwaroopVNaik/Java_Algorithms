package Assignments;

import java.util.*;

public class QuestionTwentyTwo {

    void ElectricityBill()
    {

        Scanner obj = new Scanner(System.in);

        int MaintainceeCost = 3500;

        System.out.println("Enter the Consumer Name : ");
        String ConsumerName = obj.next();

        System.out.println("Enter the Consumer ID : ");
        int ConsumerID = obj.nextInt();

        System.out.println("Enter the Energy Units Consumed : ");
        int EnergyUnits = obj.nextInt();

        System.out.println();

        System.out.println("===================================");

        System.out.println("Consumer Name : " + ConsumerName);

        System.out.println("Consumer ID : " + ConsumerID);

        System.out.println("===================================");

        if(EnergyUnits <= 100)
        {
            EnergyUnits = EnergyUnits * 2;

            System.out.println("Energy Units : " + EnergyUnits);

            System.out.println("Maintaince Charge and GST : " + MaintainceeCost);

            System.out.println("Total Bill : " + (MaintainceeCost + EnergyUnits));

            System.out.println("===================================================");
        }
        else if (EnergyUnits > 100 && EnergyUnits <= 200 )
        {
            EnergyUnits = (100 * 2) + ((EnergyUnits - 100) * 3);

            System.out.println("Energy Units : " + EnergyUnits);

            System.out.println("Maintaince Charge and GST : " + MaintainceeCost);

            System.out.println("Total Bill : " + (MaintainceeCost + EnergyUnits));

            System.out.println("===================================================");
        }
        else if (EnergyUnits > 200 && EnergyUnits <= 300)
        {
            EnergyUnits = (100 * 2) + (100 * 3) + ((EnergyUnits - 200) * 5);

            System.out.println("Energy Units : " + EnergyUnits);

            System.out.println("Maintaince Charge and GST: " + MaintainceeCost);

            System.out.println("Total Bill : " + (MaintainceeCost + EnergyUnits));

            System.out.println("===================================================");
        }
        else
        {
            EnergyUnits = (100 * 2) + (100 * 3) + (100 * 5) + ((EnergyUnits - 300) * 7);

            System.out.println("Energy Units : " + EnergyUnits);

            System.out.println("Maintaince Charge and GST: " + MaintainceeCost);

            System.out.println("Total Bill : " + (MaintainceeCost + EnergyUnits));

            System.out.println("===================================================");

        }

        System.out.println("Thank You !");

        System.out.println("===================================================");

    }
    

    public static void main(String[] args) {

        QuestionTwentyTwo obj = new QuestionTwentyTwo();
        obj.ElectricityBill();
        
    }

}
