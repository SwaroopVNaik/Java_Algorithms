package Methods_Practice;

import java.util.Scanner;

public class StudentMarksGrading {

    static char getStudentGrade(float marks)
    {
        if(marks > 90)
        {
            return 'A';
        }
        else if(marks >= 75 && marks <= 90)
        {
            return 'B';
        }
        else if(marks >= 60 && marks <= 75)
        {
            return 'C';
        }
        else if(marks >= 40 && marks <= 65)
        {
            return 'D';
        }
        else
        {
            return 'F';
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input Validation
        while (true)
        {

            System.out.println("Enter the Marks of Student to get Grades (0 - 100) :");
            float marks = sc.nextInt();

            if(marks >= 0 && marks <= 100)
            {
                char result = getStudentGrade(marks);
                System.out.println("Grade : " + result);
                break;
            }
            else
            {
                System.out.println();
                System.out.println("Entered Marks :" + marks);
                System.out.println("Invalid Input");
                System.out.println();
            }

            sc.close();
        }


    }

}
