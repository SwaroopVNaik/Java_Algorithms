public class Temperature {
    public static void main(String[] args) {
        
        float Celsisus = 25;
        float Faraheniet = 40;

        // Converting from C to F
        // F = (C x 9/5) + 32 

        float Converted_Faraheniet = (Celsisus * 9/5 ) + 32;

        System.out.println("The Faraheniet is : " + Converted_Faraheniet);

        // Converting from F to C 
        // C = (F - 32) X 5/9

        float Converted_Celsisus = (Faraheniet - 32) * 5/9;

        System.out.println("The Celesisus is : " + Converted_Celsisus);

    }
}
