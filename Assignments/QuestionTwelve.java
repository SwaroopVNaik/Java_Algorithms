package Assignments;

import java.util.Scanner;

public class QuestionTwelve{

    void cube(int number)
    {

        int Cube = number * number * number;
        System.out.println("The Cube of the number is : " + Cube);

        Square();
    }

    void Square()
    {
        Scanner SC = new Scanner(System.in);


        System.out.println("Enter the Number to get Sqaure number : ");
        int number = SC.nextInt();

        int Sqaure = number * number;
        System.out.println("The Square of the number is : " + Sqaure);

        SC.close();
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number to find the Cube : ");
        int number = sc.nextInt();

        QuestionTwelve obj = new QuestionTwelve();
        obj.cube(number);

        sc.close();
    }
    
}