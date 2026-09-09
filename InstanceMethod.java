public class InstanceMethod {

    // Instance method ---- 2nd type of method in java 

    int Imax(int x , int y)
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
    
    public static void main(String[] args) {
        
        int a = 10, b = 15;
        
        InstanceMethod Insta = new InstanceMethod();

        // className Reference variable = new Reference Variable

        int c = Insta.Imax(a, b);

        // varibale = Reference Varible .(acess method)(input)

        System.out.println(c);

    }

}
