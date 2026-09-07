public class BreakandContinue 
{
    public static void main(String[] args) 
    {

        for(int i = 1 ; i<= 10; i++)
        {
            if(i%2 != 0)
                // break; // 1, 2, 3, 4
                // odd 
                continue;
            System.out.println(i);
        }

    }
}

