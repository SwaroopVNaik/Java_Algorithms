package PassByValue;

public class Name {

    static String getName(String name)
    {
        return name = "Shivu";
    }

    public static void main(String[] args) {

        String name = "Roshan";

        String result = getName(name);

        System.out.println(result);

    }

}
