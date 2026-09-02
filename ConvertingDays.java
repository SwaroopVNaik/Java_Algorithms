public class ConvertingDays 
{

    public static void main(String[] args) 
    {
        
        int Givendays = 550; 
        int NoOfDaysInAYear = 365;

        // Assumed
        int NoOfDaysInAMonth = 30;

        int NoOfYearsInGivenDays = Givendays / NoOfDaysInAYear;

        System.out.println("No of year in Given Number of Days : " + NoOfYearsInGivenDays);

        System.out.println();

        int NoofMonthsInGivenDays = Givendays / NoOfDaysInAMonth;

        System.out.println("The No of Months in Given Days is :" + NoofMonthsInGivenDays);
        System.out.println();

        int RemainingDays = Givendays % NoOfDaysInAMonth;

        System.out.println("Remaing Days : " + RemainingDays);


    }

}
