package VariableArguments;

public class ReportCard 
{
    void getStudentReport(String studentName, int...marks)
    {
        int total = 0;

        // int securedMarks = 0;

        // for(int mark : marks)
        // {
        //     securedMarks = mark; 
        // }

        // for(int index = 0; index < marks.length ; index = index + 1)
        // {
        //     total = total + securedMarks;
        // }

        for(int mark : marks)
        {

            total = total + mark;
        
        }
    
        System.out.println("Student Name : " + studentName); 
        System.out.println("Total Marks : " + total);
    }

    public static void main(String[] args) 
    {

        ReportCard obj = new ReportCard();

        obj.getStudentReport("Suraj", 85);
        obj.getStudentReport("Suraj", 85, 90, 78);
        obj.getStudentReport("Swaroop", 95, 88, 92, 76, 89);

    }

}
