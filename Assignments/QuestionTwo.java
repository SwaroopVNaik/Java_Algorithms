package Assignments;

import java.util.*;

public class QuestionTwo {

    String Grades(int StudentMarks)
    {
        if(StudentMarks >= 90 && StudentMarks <= 100)
        {
            return "A+";
        }
        if(StudentMarks >= 80 && StudentMarks <= 89)
        {
            return "A";
        }
        if (StudentMarks >= 70 && StudentMarks <= 79) 
        {
            return "B+";
        }
        if(StudentMarks >= 60 && StudentMarks <= 69)
        {
            return "B";
        }
        if(StudentMarks >= 50 && StudentMarks <= 59)
        {
            return "C";
        }
        if(StudentMarks >= 40 && StudentMarks <= 49)
        {
            return "D";
        }
        if(StudentMarks > 100)
        {
            return "Invalid Input";
        }
        else
        {
            return "Fail";
        }
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Student Marks : ");
        int StudentMarks = obj.nextInt();

        QuestionTwo OBJ = new QuestionTwo();
        String result = OBJ.Grades(StudentMarks);

        System.out.println("The Student has Secured : " + result);

        obj.close();
    }
}
