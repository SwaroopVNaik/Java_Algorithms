public class Trail {

    // Recussion
    void BasicSalary()
    {
        System.out.println("Hello Basic Slary");

        HRA();
    }

    void HRA()
    {
        System.out.println("Hello HRA");

        // Trail obj = new Trail();
        // obj.BasicSalary();
    }
    
    public static void main(String[] args) {


        Trail obj = new Trail();
        obj.BasicSalary();

        obj.HRA();

    }

}
