package Assignments;

import java.util.Scanner;

public class QuestionSeven {

    static void Ascii(String Answer)
    {
        if(Answer.equals("YES")|| Answer.equals("yes") || Answer.equals("Yes"))
        {
            for(char Alpha = 'A'; Alpha <= 'Z'; Alpha++)
            {
                System.out.println(Alpha + " = " + (int)Alpha);
            }
        }
        else
        {
        System.out.println("Thank You For Your Response");
        }
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Do You want to know the Ascii of Every Alphabet : (yes/no)");

        String Answer = obj.next();

        // Static method so no need of creating Object !
        Ascii(Answer);

        obj.close();

    }

}
