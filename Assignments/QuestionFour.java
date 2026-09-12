package Assignments;

import java.util.Scanner;

public class QuestionFour {

    String CheckLogin(String UserName, String Password){

        if(UserName.equals("admin") && 
           Password.equals("Java123") )
        {
            return "Login Successfull";
        }
        else
        {
            return "Invalid User";
        }

    }

    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Login Credentinals : ");
        System.out.println();

        System.out.println("Enter the UserName : ");
        String UserName = obj.next();

        System.out.println();

        System.out.println("Enter the Password");
        String Password = obj.next();

        QuestionFour OBJ = new QuestionFour();
        String login = OBJ.CheckLogin(UserName, Password);

        System.out.println();

        System.out.println(login);

        obj.close();

    }

}
