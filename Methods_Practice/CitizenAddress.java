package Methods_Practice;

import java.util.Scanner;

public class CitizenAddress {

    static void getCitizenAddress(String name, String houseNumber, String street, 
                                  int wardNumber, int pinCode)
                                  {
                                    System.out.println(name + " ," + " #" + 
                                                       houseNumber + " ," + 
                                                       street + " Cross" + " ," + "Ward " +
                                                       wardNumber +  " ," + "Bengaluru - " + 
                                                       pinCode);
                                  }

    public static void main(String[] args) 
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter The Citizen Name :");
        String name = obj.next();

        System.out.println("Enter the house Number : ");
        String houseNumber = obj.next();

        System.out.println("Enter the Street : ");
        String street = obj.next();

        // Input Validation
        while(true){

            System.out.println("Enter the ward number : ");
            int wardNumber = obj.nextInt();

            System.out.println("Enter the pin Code : ");
            int pinCode = obj.nextInt();

            if(wardNumber > 0 && pinCode > 0)
            {
                getCitizenAddress(name, houseNumber, street, wardNumber, pinCode);
                break;
            }
            else 
            {
                System.out.println("Invalid Input check wardNumber and pinCode");
            }
        }

        obj.close();

    }

}
