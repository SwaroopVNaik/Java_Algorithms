package PassByValue;

public class Maths {

    static void getSum(Value numberA,Value numberB, Value sum)
    {
        sum.SUM = numberA.numA + numberB.numB;
    }

    public static void main(String[] args) {

        Value obj1 = new Value();
        Value obj2 = new Value();
        Value obj3 = new Value();
        obj1.numA = 10;
        obj2.numB = 20; 
        obj3.SUM = 0;

        System.out.println(obj3.SUM);

        getSum(obj1, obj2, obj3);

        System.out.println(obj3.SUM);

    }
}
