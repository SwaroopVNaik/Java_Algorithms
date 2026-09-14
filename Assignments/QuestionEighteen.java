package Assignments;

import java.util.Scanner;

public class QuestionEighteen {

    static void UserEnterPin()
    {
        Scanner SC = new Scanner(System.in);

        int Attempts = 1;

        String pin = "";

        // Where to store the updated variable ! (pending)

        for(int index = 3; index >= Attempts; index = index - 1 )
        {
            System.out.println("Enter the Pin : ");
            pin = SC.next();

            if(pin.equals("0095") && pin.length() == 4)
            {
                PIN(pin);
                return;
            }
            else
            {
                System.out.println(index + " Attempts left");
            }

        }

        System.out.println("User is Blocked 3 of 3 Attempts");
            
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
                CheckBalance(Balance, Deposit);
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

    static void CheckBalance(double Deposit, double WithDraw)
    {
        double Balance = 50000;

        double TotalBalance = 0;

        double TotalBalance2 = 0;

        System.out.println("Total Balance : " + Balance);

        if(Deposit > 0)
        {
            TotalBalance = Balance + Deposit;
            System.out.println("Balance : " + TotalBalance);
        }
        else if(WithDraw > 0)
        {
            TotalBalance2 = Balance - WithDraw;
            System.out.println("Balance : " + TotalBalance2);
        }


    }

    static void DepositMoney(double Balance)
    {

        double WithDraw = 0;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Amount to Deposit : ");
        double Deposit = obj.nextDouble();

        System.out.println("Amount : " + Deposit + " Successfully Deposited ");

        CheckBalance(Deposit, WithDraw);

    }

    static void WithDrawMoney()
    {

        double Deposit = 0;

        double WithDraw = 0;

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Amount to with draw Money : ");
        WithDraw = obj.nextDouble();

        System.out.println("Amount : " + WithDraw + " Successfully With Draw Money");

        CheckBalance(Deposit, WithDraw);

    }

    static void ChangePin()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Previous Pin : ");
        String PrevPIN = obj.next();

        String NewPin = "";

        if(PrevPIN.equals("0095") && PrevPIN.length() == 4)
        {
            System.out.println("Enter Your New Pin : ");
            NewPin = obj.next();
            System.out.println("The New Pin successfully Changed : " + NewPin);

        }
        else
        {
            System.out.println("Previous Pin is not Matching");
        }
    }

    static void Exit()
    {
        System.out.println("Thank You For Banking with SBI");
        System.out.println("Successfull done ! after coding it for 8 hours ! ");
    }

    public static void main(String[] args) {

        UserEnterPin();

    }

}
