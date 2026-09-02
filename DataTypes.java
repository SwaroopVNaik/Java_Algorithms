public class DataTypes 
{
    public static void main(String[] args) 
    {
        
        byte byteValue = 10; // 1 byte => 8 bits => range (-127 to 127)
        short shortValue = 120; // 2 byte => 16 bits => range (-32,768 to 32,767)
        int integerValue = 3000000; // 4 byte => 32 bits 
        // bydefault java considers it as integer so we denote L for long
        long longValue = 2056789009876789L; // 8 byte => 64 bit 
        // bydefault java consider it as decimal so for float we denote f so it considers it as float 
        float floatValue = 3.14f; // 4 byte => 32 bits
        // by default in java double is all decimal values
        double doubleValue = 09.8765433456789d; // 8 byte => 64 bits 
        char charValue = 'S'; // 2 byte = 16 bit
        boolean booleanValue = true; // size depends on JVM 
        String StringValue = "Swaroop"; // String is Capital so it is a class
    
    
        // The Basic data type in java is integer.

        // byte and short was introduced java as to run 16 bit computers.

        System.out.println();
        System.out.println("The value of byte is : " +  byteValue);
        System.out.println();
        System.out.println("The value of SHort is :  " + shortValue);
        System.out.println();
        System.out.println("The Value of Integer is : " + integerValue);
        System.out.println();
        System.out.println("The Value of Long is : " + longValue);
        System.out.println();
        System.out.println("The Value of float is : " + floatValue);
        System.out.println();
        System.out.println("The Value of double is : " + doubleValue);
        System.out.println();
        System.out.println("The Value of char is  : " + charValue);
        System.out.println();
        System.out.println("The Value of boolean is : " + booleanValue);
        System.out.println();
        System.out.println("The Value of String is  : " + StringValue);
        System.out.println();

    }
}
