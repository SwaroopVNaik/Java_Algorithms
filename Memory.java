public class Memory {
    public static void main(String[] args) {
        int x = 10; // stack - memory
        int y = 20; // stack - memory 
        int z = x + y; // stack - memory

        String str = new String("Sum " + z);  
        // (The Java will make the Z to string concatnate and print 3030)
        System.out.println(str+z);
    }
}
