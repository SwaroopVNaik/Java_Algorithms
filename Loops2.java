import java.util.*;

public class Loops2 
{

    public static void main(String[] args) 
    {

        Scanner sc = new Scanner(System.in);

        // Print powers of 2 upto 64

        int power;
        int end;
        int start;

        System.out.println("Enter the number : ");
        power = sc.nextInt();

        System.out.println("Enter the number to end");
        end = sc.nextInt();

        for(start = power; start <= end; start++)
        {

            System.out.println(start * start);

        }

        //  while loop

        // int power;
        // int end;
        // int start;


        // System.out.println("Enter the number to check the power of 2");
        // power = sc.nextInt();

        // System.out.println("Enter thr number to end");
        // end = sc.nextInt();

        // while(start <= end)
        // {
        //     System.out.println(start * start);
        //     start++;
        // }

        // do while

        // int power;
        // int end;
        // int start = 1;

        // System.out.println("Enter the number to check the power of 2");
        // power = sc.nextInt();

        // System.out.println("Enter thr number to end");
        // end = sc.nextInt();

        // do{
        //     System.out.println(start * start );
        //     start++;
            
        // }while(start <= end);

        // Multiplication of 5 

        // int number; 
        // int indexx;

        // System.out.println("Enter the number to multiply");
        // number = sc.nextInt();

        // for(indexx = 1; indexx <= 10; indexx++){

        //     int Multiplication = number * indexx;
        //     System.out.println(number + " X " + indexx + " = " + Multiplication);

        // }

        // While Loop 

        // int number = 1; 
        // int indexx = 1;

        // System.out.println("Enter the number to multiply");
        // number = sc.nextInt();

        // while(indexx <= 10){

        //     int Multiplication = number * indexx;
        //     System.out.println(number + " X " + indexx + " = " + Multiplication);
        //     indexx++;
        // }

        // do while 

        // do{

        //     int Multiplication = number * indexx;
        //     System.out.println(number + " X " + indexx + " = " + Multiplication);
        //     indexx++;

        // }while(indexx <= 10);

        // Decrement 

        int number;
        int numberTwo;
        int index;

        System.out.println("Enter the start number :");
        number = sc.nextInt();

        System.out.println("Enter the second number");
        numberTwo = sc.nextInt();


        for(index = number ; index >= numberTwo ; index = index - 10){

            // int sub = index - 10;
            System.out.println(index);

        }

    }


}
