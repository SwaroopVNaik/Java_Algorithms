public class Minutes{
    public static void main(String[] args){

        // To convert Hours to minutes =>
        // Hours = total minutes / 60

        float minutes = 145; 
        float hours = minutes / 60;

        System.out.println("The converted Hours to minutes is : " + hours + " Hours.");

        // Remaining Minutes => 
        // Remaining Minutes = minutes - (hours x 60)

        int RemainingMinutes = minutes - ((long)hours * 60);
        System.out.println("The Remaining minutes our : " + RemainingMinutes);
    

    }
}