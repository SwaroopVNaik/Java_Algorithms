public class ReturnArray 
{

    static int[] update(){

        int a[] = {10, 20, 30, 40};
        return a;


    }

    public static void main(String[] args)
    {
        int b[] = update();

        System.out.println("Before Modification : ");
        
        // System.out.println(b[0] + " " + b[1] + " " + b[2] + " " + b[3]);

        for(int index = 0 ; index <= b.length-1 ; index = index + 1)
        {
            System.out.print(b[index] + " ");
        }
        
        b[0] = 100;

        System.out.println();
        System.out.println();

        System.out.println("After updation : ");
        System.out.println();
        // System.out.println(b[0] + " " + b[1] + " " + b[2] + " " + b[3]);

        for(int index = 0 ; index <= b.length-1 ; index = index + 1)
        {
            System.out.print(b[index] + " ");
        }


    }

}
