package Methods_Practice;

import java.util.Scanner;

public class ShopRecipt 
{

    static void getShopRecipt(String name, String item, int kiloGrams, int Price)
    {
        int unitPrice = 2;

        double totalAmount = unitPrice * Price;

        System.out.println(name + " | " + item + " " + kiloGrams + "Kg" + " | " + unitPrice + " x" + " Rs " + Price + " = " + totalAmount);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = sc.next();

        System.out.println("Enter the Item Name :");
        String item = sc.next();

        // Input Validation
        while(true)
        {

            System.out.println("Enter the quantiy of item : ");
            int kiloGrams = sc.nextInt();

            System.out.println("Price of the item : ");
            int price = sc.nextInt();

            if(kiloGrams >= 0 && price >= 0)
            {
                getShopRecipt(name, item, kiloGrams, price);
                break;
            }
            else
            {
                System.out.println("Please Enter a Valid Input check kilograms and price");
            }

        }

        sc.close();
    }

}
