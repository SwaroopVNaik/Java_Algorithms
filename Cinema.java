public class Cinema {

    public static void main(String[] args) {
        
        int NoOfSeatsInEachRow = 15;
        int NoOfPeopleArrived = 121; 

        System.out.println("No of Seats in Each Row : " + NoOfSeatsInEachRow);
        System.out.println();
        System.out.println("No of People Come To Watch The Movie :" + NoOfPeopleArrived);
        System.out.println();


        // How many Complete Rows can be Filled ?

        int CompleteRows = NoOfPeopleArrived / NoOfSeatsInEachRow ;

        System.out.println("The Complete Rows Filled are : " + CompleteRows);
        System.out.println();

        // How many People will be seated in last row ?

        int NoOfPeopleSeatedInLastRow = NoOfPeopleArrived % CompleteRows;

        System.out.println("The No Of People Seated In Last Row is : " + NoOfPeopleSeatedInLastRow);
        System.out.println();

        // Which Operator is used to find Number of Complete Rows ?
        // Answer : / (Qoutient)

        // Which Operator is used to find the Remaining people ?
        // Answer : % (Remainder)

        // If the Audience become 120 what will be the output ?
        // Answer : No of People Come To Watch The Movie :120
        // Answer : The Complete Rows Filled are : 10
        // Answer : The No Of People Seated In Last Row is : 0

        // if the audience becomes 121 , what will be the ouput ?
        // and if there are 15 seats per row instead of 12 
        // Answer : No of Seats in Each Row : 15
        // Answer : No of People Come To Watch The Movie :121
        // Answer : The Complete Rows Filled are : 8
        // Answer : The No Of People Seated In Last Row is : 1

        // / (Quotient)-> should be used in cases to find how many ? 
        // % (Remainder) -> should be used in cases of Leftover ? 

    }
    
}