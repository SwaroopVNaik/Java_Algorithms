package Assignments;

import java.util.Scanner;

public class QuestionSix {

    void vowels(char Alpha)
    {

        if(Alpha == 'A' || Alpha == 'a' ||
           Alpha == 'E' || Alpha == 'e' ||
           Alpha == 'I' || Alpha == 'i' ||
           Alpha == 'O' || Alpha == 'o' ||
           Alpha == 'U' || Alpha == 'u' )
           {
            System.out.println("it is a Vowel");
           }
        else
        {
            System.out.println("it is a Constant");
        }
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the First Alpha : ");
        char ALpha = obj.next().charAt(0);

        QuestionSix objA = new QuestionSix();
        objA.vowels(ALpha);

        obj.close();

    }


}
