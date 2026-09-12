package Assignments;

import java.util.*;

public class QuestionOne {

    void PersonAge(int Age){

        if(Age >= 60 && Age > 0)
        {
            System.out.println("Senior Citizen");
        }

        if(Age < 60)
        {
            System.out.println("Not a Senior Citizen");
        }
        
    }

    public static void main(String[] args) {

        // check weather the age is creater than one 

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Age : ");
        int Age = obj.nextInt();

        QuestionOne obj2 = new QuestionOne();
        obj2.PersonAge(Age);

        obj.close();
    }

}
