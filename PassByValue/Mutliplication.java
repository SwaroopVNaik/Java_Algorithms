package PassByValue;

class Mutliplication {


    static void getProduct(MultiValue number_v1, MultiValue name_v1, MultiValue price_v1)
    {
        name_v1.name = "Roshan"; 
        number_v1.number = 10;
        price_v1.price = 345.6f;
        

    }


    public static void main(String[] args) {

        MultiValue obj  = new MultiValue();

        obj.number = 5;
        obj.name = "Shivu";
        obj.price = 126.7f;

        System.out.println(obj.number);
        System.out.println(obj.name);
        System.out.println(obj.price);

        getProduct(obj, obj, obj);

        System.out.println(obj.number);
        System.out.println(obj.name);
        System.out.println(obj.price);


        
    }

}
