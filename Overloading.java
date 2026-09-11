public class Overloading 
{

    int max(int x, int y)
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

    float max(float x, float y) 
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

    int max(byte x, byte y)
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

    /* int max(byte x, byte y) parameter cannot be same in method overloading
    {
        if(x > y)
        {
            return x;
        }
        else
        {
            return y;
        }
    } */

        // Max of three numbers 

        int max(int x, int y, int z)
        {
            if(x > y && x >= z)
            {
                return  x;
            }
            else if(y >= x && y >= z)
            {
                return y;
            }
            else
            {
                return z;
            }
        }
    


    public static void main(String[] args) 
    {

        Overloading obj1 = new Overloading();
        System.out.println(obj1.max(10, 20));
        System.out.println(obj1.max(10, 20, 30));



    }

}
