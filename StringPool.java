public class StringPool 
{
    public static void main(String[] args) 
    {
        
        // Condition : 1
        String S1 = "Saturday";
        String S2 = "Saturday";

        // It becomes true because both the strings store the same Value 
        // So the java reference varibale points the same object because od same value
        // java won't create a new object
        if(S1 == S2){
            System.out.println("The S1 and S2 is Equal");
        }
        else
        {
            System.out.println("The S1 and S2 is not Equal");
        }
        
        System.out.println(S1.equals(S2)); // come true

        // Condition 2 :

        String S3 = new String("Java"); 
        String S4 = new String("Java");

        System.out.println("Comapring Using Relational Operaters S3 and S4 : " + (S3 == S4));
        System.out.println("Comparing Using .equals() method S3 and S4: " + (S3.equals(S4)));

        // Condition 3:

        String S5 = new String("JVM");
        String S6 = "JVM";

        System.out.println("Comparing Using Relational Operators S5 and S6 : " + (S5 == S6));
        System.out.println("Comapring Using .equals() Method S5 and S6 : " + (S5.equals(S6)));

    }
}
