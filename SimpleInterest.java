public class SimpleInterest 
{
    public static void main(String[] args) 
    {
        float PrincipleAmount = 40;
        float RateOfInterest = 5;
        String Time = "2.5";

        // Simple Interest Formula => 
        // SI = (P x R X T)

        // To convert String to float we use parseFloat
        float t = Float.parseFloat(Time);

        float SI = (PrincipleAmount * RateOfInterest * t) / 100;
        System.out.printf("The Simple Interest is : %.2f%n" , SI);

        // Compound Interest Formula => 
        // A = P ( 1 + R / 100)^T

        // Storing the value in double as Math.pow returns double
        // To Initialize power in code we use Math.pow
        double PrincipleInterest = PrincipleAmount * Math.pow((1 + RateOfInterest / 100), 2);

        System.out.printf("The Principle Interest is : %.1f%n" , PrincipleInterest);
        
    }
}
