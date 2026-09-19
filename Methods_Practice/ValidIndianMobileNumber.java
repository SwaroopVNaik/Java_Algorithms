package Methods_Practice;

import java.util.Scanner;

public class ValidIndianMobileNumber {

    Boolean isValidIndianMobileNumber(String mobileNumber)
    {

        // 6, 7 ,8, 9
        if(mobileNumber.length() == 10 
            && 
            (mobileNumber.charAt(0) == '6' 
            || 
            mobileNumber.charAt(0) == '7' 
            || 
            mobileNumber.charAt(0) == '8' 
            ||
            mobileNumber.charAt(0) == '9')
        )
        {
            return true;
        }
        else
        {
            return false;
        }

    }

    public static void main(String[] args) 
    {
     
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the Mobile Number : ");
        String mobileNumber = obj.next();

        ValidIndianMobileNumber obj_V2 = new ValidIndianMobileNumber();

        Boolean Validation = obj_V2.isValidIndianMobileNumber(mobileNumber);

        if(Validation == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }

        obj.close();
        
    }

}
