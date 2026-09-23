package VariableArguments;

public class VarArgs 
{

    static void show(int...a)
    {
        System.out.println("Arguments");

        // normal for loop
        for(int index = 0; index < a.length; index = index + 1)
        {
            System.out.print(a[index]);

            if(index < a.length)
            {
                System.out.print(",");
            }
        } 

    }

    /* static void show(int a)
    {
        System.out.println("One Argument");
    }

    static void show(int a , int b)
    {
        System.out.println("Two Argument");
    } */
    

    public static void main(String[] args) 
    {

        show();
        show(10);
        show(10, 70);
        show(15, 16, 17, 18, 19); // internally => show(new int[] = {15, 16})

    }
}
