public class Binary 
{
    public static void main(String[] args) {

        // Integer Types can be Repesented in Different Number systems 
        // start with zero -> binary, octal, hexa

        byte b1 = 10; // decimal_value 
        byte b2 = 0b1010; // 0b -> Perifix for binary (binary value stored in 0b2)
        byte b3 = 012; // Octal (0 - 7 , 10, 11, 12)
        byte b4 = 0xA; // hexa (0 - 9, A - F) 0xA -> Preifix for HexaDecimal

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);


    }
}
