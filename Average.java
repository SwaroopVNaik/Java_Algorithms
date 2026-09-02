public class Average 
{
    public static void main(String[] args) 
    {
        
        int DSA = 100;
        System.out.println();
        System.out.println("The marks Obtained in DSA : " + DSA + "/100");

        int DBMS = 45;
        System.out.println();
        System.out.println("The marks Obtained in DBMS : " + DBMS + "/100");

        int OS = 70;
        System.out.println();
        System.out.println("The marks Obtained in OS : " + OS + "/100");

        int ADA = 15;
        System.out.println();
        System.out.println("The marks Obtained in ADA : " + ADA + "/100");

        int git_version_control = 35;
        System.out.println();
        System.out.println("The marks Obtained in git_version_control : " + git_version_control + "/100");
        System.out.println();

        int total = DSA + DBMS + OS + ADA + git_version_control;
        int total_marks = 500;

        System.out.println(total);

        System.out.println();
        System.out.println("The total marks of exam :" + total_marks);
        System.out.println();

        int number_of_subjects = 5;

        double Average = (total / number_of_subjects);
        System.out.println("The Average of 5 Subjects is : " + Average);

        float percentage =((float)total / (float)total_marks)* 100;

        System.out.println();
        System.out.println("The Percentage of 5 subjects is :" + percentage);

    }
}
