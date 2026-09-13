package Assignments;

import java.util.Scanner;

public class QuestionEight {

    void Countdown(int number){

        System.out.println();

        int index = number;
        while(index >= 1)
        {
            
            System.out.println(index);
            index = index - 1;
        }
        System.out.println("Congratulations ! ");
    }


    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number To get Countdown : ");
        int number = obj.nextInt();

        QuestionEight OBJ = new QuestionEight();
        OBJ.Countdown(number);

        obj.close();
    }

}
