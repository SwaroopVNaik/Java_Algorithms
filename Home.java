class Home
{
    public static void main(String[] args) 
    {
        int a = 1;
        int b = 2;
        int c = 3;

        System.out.println("____Before  Swapping____");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

        a = a + b + c;
        c = a - b - c;
        // b = a - b - c;
        a = a - b - c;



        System.out.println("____After Swapping____");
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("c : " + c);

    }
}