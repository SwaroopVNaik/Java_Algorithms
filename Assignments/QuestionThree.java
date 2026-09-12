package Assignments;

import java.util.Scanner;

public class QuestionThree {

    void LoanApprovel(float Salary, int Age){

        if(Age >= 21 && Salary >= 30000)
        {
            System.out.println("Loan Approved ! congratulations ! ");
        }
        else
        {
            System.out.println("Sorry ! Loan not approved");
        }
    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Age");
        int Age = obj.nextInt();

        System.out.println("Enter the Salary");
        float Salary = obj.nextInt();

        QuestionThree OBJ = new QuestionThree();
        OBJ.LoanApprovel(Salary, Age);

        obj.close();

    }

}
