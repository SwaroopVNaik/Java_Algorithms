package Assignments;

import java.util.Scanner;

public class Lucky_number {

    void SumOfDigits(int Day, int Month, int Year){

        // Adding all the Numbers
        int Total = Day + Month + Year; // 2029

        // getting the First Digit

        int Digit_1 = Total / 1000; 

        // getting the 2nd digit

        int Digit_2 = (Total / 100 ) % 10;

        // getting the 3rd Digit 

        int Digit_3 = (Total / 10) % 10;

        // getting the last Digit

        int Digit_4 = Total % 10;

        int Total2 = Digit_1 + Digit_2 + Digit_3 + Digit_4;

        ToSingleDigits(Total2);


    }

    void SumOfDigitsP2(int Total2)
    {
        int Single = Total2 % 10;

        Total2 = Total2 / 10;

        ToSingleDigits(Total2);
    }

    void ToSingleDigits(int Total2)
    {
        if(Total2 > 9)
        {
            SumOfDigitsP2(Total2);
        }

        PersonalityReading(Total2);

        NAME(null,Total2);

    }

    void NAME(String name, int Total2){

        System.out.println();
        System.out.println();
        System.out.println("hey " + name + " Your Lucky Number is : " + Total2);

    }

    void PersonalityReading(int Total2)
    {
        switch(Total2)
        {
            case 1:
                System.out.println("1? Bro, even your number has no backup.");
                break;
            
            case 2:
                System.out.println("2? Still can't find a third person to complete the group.");
                break;

            case 3:
                System.out.println("3? Bro thinks he's a crowd.");
                break;

            case 4:
                System.out.println("4? That's not a number, that's your IQ after lunch. 💀");
                break;

            case 5:
                System.out.println("5? Halfway to 10, just like your brain is halfway to understanding.");
                break;

            case 6:
                System.out.println("6? Bro has been counting since kindergarten.");
                break;
            
            case 7:
                System.out.println("7? Lucky number. Too bad you're not.");
                break;
            
            case 8:
                System.out.println("8? Bro is one zero away from becoming successful.");
                break;
            
            case 9:
                System.out.println("9? So close to 10, yet somehow still disappointing. 💀");
                break;
        }
    }

    public static void main(String[] args) 
    {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your Name : ");
        String name = obj.next();

        System.out.println("Enter Your BirthDay (1 - 31): ");
        int Day = obj.nextInt();

        System.out.println("Enter Your Birth Month (1 - 12): ");
        int Month = obj.nextInt();

        System.out.println("Enter Your BirthYear : ");
        int Year = obj.nextInt();

        Lucky_number obj2 = new Lucky_number();
        obj2.SumOfDigits(Day, Month, Year);
        obj2.NAME(name, Total2);


    }

}
