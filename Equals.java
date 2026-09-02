public class Equals {
    public static void main(String[] args) {
        
        int num1 = 10; // values 
        int num2 = 10; // values

        
        // if(num1 == num2) == works on primitive Data type
        // if(num1.equals(num1)) 
        if(num1 == num2)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }

        // int day = "Saturday";

        // if(Day == "Saturday") // incomaptidble data type

        // Works for objects as String is class and it has a object and object has methods.

        String Day = "Saturday";

        if(Day.equals("Saturday")){
            System.out.println("holiday");
        }
        else{
            System.out.println("holiday");
        }

    }
}
