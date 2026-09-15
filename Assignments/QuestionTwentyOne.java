package Assignments;

import java.util.Scanner;

public class QuestionTwentyOne {

    void BasicSalary()
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your Basic Salary : ");
        double BasicSalary = obj.nextDouble();

        HRA(BasicSalary);
    }

    void HRA(double BasicSalary)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your HRA Salary : ");
        double HRA = obj.nextDouble();

        DA(BasicSalary, HRA);

    }

    void DA(double BasicSalary, double HRA)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter Your DA Salary : ");
        double DA = obj.nextDouble();

        GrossSalary(BasicSalary, HRA, DA);
    }

    void GrossSalary(double BasicSalary, double HRA, double DA)
    {
        double GrossSalary = BasicSalary + HRA + DA;

        System.out.println("Gross Salary : " + GrossSalary);
    }

    public static void main(String[] args) {

        QuestionTwentyOne obj = new QuestionTwentyOne();
        obj.BasicSalary();

    }

}
