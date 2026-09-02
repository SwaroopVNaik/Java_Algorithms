public class ascii {
    public static void main(String[] args) {

        char letter = 'S';
        int ch = 0x0041; //pending

        System.out.println();
        System.out.println("Ascii of the letter :" + letter);
        System.out.println();
        System.out.println("ASCII Value : " + (byte)letter);
        System.out.println();
        System.out.println("The Unicode : " + (char)ch);

    }
}
