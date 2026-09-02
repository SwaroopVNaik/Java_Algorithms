public class Overflow 
{

    public static void recursiveMethod()
    {
        // Infinite recursion — no base case
        recursiveMethod();
    }

    public static void main(String[] args) 
    {
        recursiveMethod(); // This will trigger StackOverflowError
    }
}


