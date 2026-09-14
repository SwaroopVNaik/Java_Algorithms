package Assignments;

import java.util.Scanner;

public class QuestionEighteen {

    static void UserEnterPin()
    {
        Scanner SC = new Scanner(System.in);

        int Attempts = 3;

        String pin = "";

        // Where to store the updated variable ! (pending)

        for(int index = 1; index <= Attempts; index = index + 1 )
        {
            System.out.println("Enter the Pin : ");
            pin = SC.next();

            PIN(pin);
        }
            
    }

    static void PIN(String pin)
    {
        if(pin.equals("0095") && pin.length() == 4)
        {
            ATMMENU();
        }
        else if(!pin.equals("0095") || pin.length() < 4)
        {
            UserEnterPin();
        }
    }

    static void ATMMENU()
    {

        double Deposit = 0;
        double Balance = 0;
        double WithDraw = 0;

        Scanner ch = new Scanner(System.in);

        System.out.println("=======================");
        System.out.println("ATM System");
        System.out.println("=======================");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Money");
        System.out.println("3.WithDraw Money");
        System.out.println("4.Change Pin");
        System.out.println("5.Exit");
        System.out.println("=======================");
        System.out.println("Enter Your Choice");
        int choice = ch.nextInt();

        switch(choice)
        {

            case 1 :
                CheckBalance(Balance);
                break;

            case 2 :
                DepositMoney(Balance);
                break;

            case 3 :
                WithDrawMoney();
                break;

            case 4 :
                ChangePin();
                break;

            case 5 :
                Exit();
                break;

            default :
                System.out.println("Inavlid Choice");
                break;

        }
    }

    static void CheckBalance(double Deposit)
    {
        double Balance = 50000;

        double TotalBalance = Balance + Deposit;

        System.out.println("Balance : " + TotalBalance);


    }

    static void DepositMoney(double Balance)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Amount to Deposit : ");
        double Deposit = obj.nextDouble();

        System.out.println("Amount : " + Deposit + " Successfully Deposited ");

        CheckBalance(Deposit);

    }

    static void WithDrawMoney()
    {

        double WithDraw = 0;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Amount to with draw Money : ");
        WithDraw = obj.nextDouble();

        System.out.println("Amount : " + WithDraw + " Successfully With Draw Money");

    }

    static void ChangePin()
    {

    }

    static void Exit()
    {

    }

    public static void main(String[] args) {

        UserEnterPin();

    }

}
