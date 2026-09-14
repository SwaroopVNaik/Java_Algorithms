package Assignments;

import java.util.Scanner;

public class QuestionSevenTeen
{

    void MarksCard()
    {
        Scanner SC = new Scanner(System.in);

        System.out.println("======================================");
        System.out.println("Marks Secured in Java out of 100 : ");
        System.out.println("======================================");
        int java = SC.nextInt();

        System.out.println("======================================");
        System.out.println("Marks Secured in DSA out of 100 : ");
        System.out.println("======================================");
        int DSA = SC.nextInt();

        System.out.println("======================================");
        System.out.println("Marks Secured in DBMS out of 100 : ");
        System.out.println("======================================");
        int DBMS = SC.nextInt();

        System.out.println("======================================");
        System.out.println("Marks Secured in OS out of 100 : ");
        System.out.println("======================================");
        int OS = SC.nextInt();

        System.out.println("======================================");
        System.out.println("Marks Secured in CN out of 100 : ");
        System.out.println("======================================");
        int CN = SC.nextInt();

        TotalMarks(java, DSA, DBMS, OS, CN);

        SC.close();
    }


    static void TotalMarks(int java, int DSA, int DBMS, int OS, int CN)
    {
        
        int total = java + DSA + DBMS + OS + CN ;
        System.out.println("======================================");
        System.out.println("The total Marks Obtained is : " + total);
        System.out.println("======================================");

        Percentage(java, DSA, DBMS, OS, CN);

        Result(total, java, DSA, DBMS, OS,CN );
    }

    static void Percentage(int java, int DSA, int DBMS, int OS, int CN)
    {
        float per = ((java + DSA + DBMS + OS + CN )/ 500f ) * 100; 

        System.out.println("=========================================");
        System.out.printf("The Percentage is : %.2f", per , "%");
        System.out.println();
        System.out.println("=========================================");

        System.out.println();
        Grade(per);


    }

    static void Grade(float per)
    {
        if(per >= 90 && per <= 100)
        {
            System.out.println("Grade : A+");
        }
        else if(per >= 80 && per <= 89)
        {
            System.out.println("Grade : A");
        }
        else if(per >= 70 && per <= 79)
        {
            System.out.println("Grade : B");
        }
        else if(per >= 60 && per <= 69)
        {
            System.out.println("Grade : C");
        }
        else if(per >= 50 && per <= 59)
        {
            System.out.println("Grade : D");
        }
        else if(per >= 40 && per <= 49)
        {
            System.out.println("Grade : P+");
        }
        else if(per == 35)
        {
            System.out.println("Grade : P");
        }

    }

    static void Result(int total,int java, int DSA, int DBMS, int OS, int CN )
    {

        if(total >= 175 && java >= 35 &&  DSA >= 35 && DBMS >= 35 && OS >= 35 && CN >= 35)
        {
            System.out.println("Result : Pass");
        }
        else
        {
            System.out.println("Result : Fail");
        }
    }

    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        System.out.println("====================================");
        System.out.println("Enter the Name of the Student : ");
        System.out.println("=====================================");
        String name = SC.next();

        System.out.println("=====================================");
        System.out.println("Enter the Student USN : ");
        System.out.println("=====================================");
        String USN = SC.next();

        QuestionSevenTeen obj = new QuestionSevenTeen();
        obj.MarksCard();

        SC.close();

    }
}