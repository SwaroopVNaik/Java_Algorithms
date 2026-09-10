public class Pattern {
    public static void main(String[] args) {

        // pattern 1 
        
        for(int index = 1; index <= 5; index = index + 1)
        {
            for(int jndex = 1; jndex <= 5; jndex = jndex + 1)
            {
                System.out.print(" " + (index + jndex));
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2

        int count = 0;

        for(int index1 = 1 ; index1 <= 5; index1 = index1 + 1)
        {
            for(int jndex2 = 1; jndex2 <= 5; jndex2 = jndex2 + 1)
            {
                count = count + 1;
                // System.out.print(count + " ");
                System.out.printf("%02d " , count);
            }

            System.out.println();
        }

        System.out.println();

        // Pattern 3

        for(int index3 = 1; index3 <= 5; index3 = index3 + 1)
        {
            for(int jndex3 = 1; jndex3 <= index3; jndex3 = jndex3 + 1)
            {
                System.out.print(" " + jndex3);
            }
            System.out.println();
        }

        System.out.println();

        // pattern 4 

        int countt = 0;

        for(int index4 = 1; index4 <= 5; index4 = index4 + 1)
        {
            for(int jndex4 = 1; jndex4 <= index4; jndex4 = jndex4 + 1)
            {

                countt = countt + 1;
                System.out.print(" " + countt);

            }
            System.out.println();
        }

        // Pattern 5 

        System.out.println();

        for(int index5 = 1; index5 <= 5; index5 = index5 + 1)
        {
            for(int jndex5 = 1; jndex5 <= 5 - index5 + 1; jndex5 = jndex5 + 1){

                System.out.print(" " + jndex5);
            }

            System.out.println();

        }

        System.out.println();

        // Pattern 6 

        for(int index6 = 1 ; index6 <= 5 ; index6 = index6 + 1)
        {
            for(int jndex6 = 1; jndex6 <= 5; jndex6 = jndex6 + 1)
            {
                if(jndex6 >= index6){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Diamond 

        System.out.println();

        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5 - i; j++)
            {
                System.out.print(' ');
            }
            for(int k = 1; k <= 2 * i - 1; k++)
            {
                System.out.print("*");
            }
            System.out.println();
            
        }
    }
}
