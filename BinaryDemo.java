public class BinaryDemo{
    public static void main(String[] args) {

        double value = 8.1;

        long bits = Double.doubleToRawLongBits(value);

        System.out.println("Decimal value : " + value);
        System.out.println("Binary        : " + Long.toBinaryString(bits));
    }
}
