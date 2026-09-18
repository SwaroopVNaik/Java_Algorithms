package PassByValue;

public class India {

    static void getContryName(Continent Name)
    {
        Name.Country = "Bharat";
    }

    public static void main(String[] args) {
        
        Continent obj = new Continent();
        obj.Country = "India";

        System.out.println(obj.Country);

        getContryName(obj);

        System.out.println(obj.Country);

    }
}
