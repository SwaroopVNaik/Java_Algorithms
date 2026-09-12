package Assignments;

import java.util.*;

public class QuestionFive {

    void AnnualIncome(int Income)
    {
        if(Income >= 100000 && Income <= 200000)
        {
            System.out.println("5 % tax");
        }
        else if(Income >= 300000 && Income <= 400000)
        {
            System.out.println("10 % Tax");
        }
        else if(Income >= 500000 && Income <= 600000)
        {
            System.out.println("15 % Tax");
        }
        else
        {
            System.out.println("20 % Tax");
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your Annual Income : ");
        int Income = obj.nextInt();

        QuestionFive OBJ = new QuestionFive();
        OBJ.AnnualIncome(Income);

        obj.close();

    }

}
