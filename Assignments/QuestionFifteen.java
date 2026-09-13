package Assignments;

import java.util.Scanner;

public class QuestionFifteen 
{

    static void Percentage(int java, int DSA, int DBMS, int OS, int CN)
    {
        float per = ((java + DSA + DBMS + OS + CN )/ 500f ) * 100; 

        System.out.println("The Percentage is : " + per);

        TotalMarks(java, DSA, DBMS, OS, CN);
    }

    static void TotalMarks(int java, int DSA, int DBMS, int OS, int CN)
    {
        
        int total = java + DSA + DBMS + OS + CN ;
        System.out.println("The total Marks Obtained is : " + total);

    }

    public static void main(String[] args) 
    {
        Scanner SC = new Scanner(System.in);

        System.out.println("Enter your Marks to calculate the Percentage");

        System.out.println("Marks Secured in Java out of 100 : ");
        int java = SC.nextInt();

        System.out.println("Marks Secured in DSA out of 100 : ");
        int DSA = SC.nextInt();

        System.out.println("Marks Secured in DBMS out of 100 : ");
        int DBMS = SC.nextInt();

        System.out.println("Marks Secured in OS out of 100 : ");
        int OS = SC.nextInt();

        System.out.println("Marks Secured in CN out of 100 : ");
        int CN = SC.nextInt();

        Percentage(java, DSA, DBMS, OS, CN);

        SC.close();
    }
}
