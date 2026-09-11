public class PassObject {

    static void update(int b[] ) // 10, 20 , 30, 40 (Refernce is created)
    {
        b[0] = 100; // 100, 20, 30, 40

        System.out.println("inside update : " + b[0]); // 100
    }

    public static void main(String[] args) {

        // There no pass by refrence in java 
        
        int a [] = {10, 20, 30, 40}; 
        System.out.println("Before Method call : " + a[0]); // 10

        update(a);

        System.out.println("After Method call : " + a[0]); // 100

    }

}