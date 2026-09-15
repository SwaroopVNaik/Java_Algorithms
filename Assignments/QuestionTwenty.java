package Assignments;

import java.util.Scanner;

public class QuestionTwenty {

    static void LibraryBookSearch(String UserBook)
    {
        String Library[] = {"DBMS", "DSA", "JAVA", "CN", "OS", "ADA"};

        int index = 0;
        Boolean found = false;
        while(index <= Library.length - 1)
        {
            if(UserBook.equalsIgnoreCase(Library[index]))
            {
                found = true;
                break;
            }

            index = index + 1;
        }

        if(found == true)
        {
            System.out.println("The book is Found");
        }
        else
        {
            System.out.println("The Book is not found");
        }

    }

    public static void main(String[] args) 
    {

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter the Book Name : ");
        String UserBook = SC.next();

        LibraryBookSearch(UserBook);
    }

}
