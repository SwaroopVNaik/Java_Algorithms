public class ManyMethods {

    static void CalculateSalary()
    {
        Calculatetax();
        System.out.println("Final Salary Generated");
    }

    static void Calculatetax()
    {
        CalculateDA();
        System.out.println("Tax Calculation done");
    }
    
    static void CalculateDA()
    {
        CalculateHRA();
        System.out.println("Da is Calculated");
    }

    static  void CalculateHRA()
    {
        calculateBasic();
        System.out.println("HRA is Calculated");
    }

    static void calculateBasic()
    {
        System.out.println("Basic Calculated");
    }


    public static void main(String[] args) {
        
        CalculateSalary();

    }

}
