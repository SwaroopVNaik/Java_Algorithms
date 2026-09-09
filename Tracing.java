public class Tracing 
{
    public static void main(String[] args)
    {

        // Tracing problem 1 (a)
        // int n = 5;
        // int sum = 0;

        // for(int i = 1; i <= n ; i++){

        //     if(i % 2 == 0)
        //     {
        //         sum = sum + i;
        //     }
        //     else
        //     {
        //         sum = sum + (i * 2);
        //     }

        //     int j = 1;

        //     while(j < 2){

        //         sum = sum - 1;
        //         j -- ;

        //     }

        // }
        // System.out.println("sum = " + sum);

        // tracing problem - 1

        // int a = 8;
        // int b = 3;


        // int result = a * 2 + b;

        // if(result % 2 == 0)
        // {
        //     result = result /2;
        // }
        // else
        // {
        //     result = result + 5;
        // }
        // System.out.println(result);

        // Tracing Problem - 2

        // int n = 15; 

        // if( n > 10){
        //     n = n - 5;

        //     if (n % 2 == 0)
        //     {
        //         n = n / 2;
        //     }
        //    else{
        //         n = n + 3;
        //     }
        // }
        // else
        // {
        //     n = n * 2;
        // }


        // System.out.println(n);

        //  tracing problem - 3

        // int sum = 0;

        // for(int index = 1; index <= 6; index ++)
        // {
        //     if(index % 2 == 0){
        //         sum = sum + index;
        //     }
        //     else
        //     {
        //         sum = sum + 2;
        //     }
        //     System.out.println(sum);
        // }

        // Tracing problem - 4

        // int num = 527;
        // int sum = 0;

        // while(num > 0)
        // {
        //     int digit = num % 10;
        //     if(digit % 2 == 0)
        //     {
        //         sum = sum + digit;
        //     }
        //     else 
        //     {
        //         sum = sum + 1;
        //     }

        //     num = num / 10;

        // }

        // System.out.println(sum);

        // Tracing Problem - 5

        // int i = 5;
        // int result = 0;

        // do{
        //     if(i % 2 == 0)
        //     {
        //         result = result + i;
        //     }
        //     else
        //     {
        //         result = result - 1;
        //     }

        //     i = i - 1;

        // }while(i > 1);

        // System.out.println(result);

        // Tracing Problem - 6

        // int count = 0;

        for(int i = 1; i <= 3; i++)
        {
            for(int j = 1; j <= 3; j++)
            {
                if((i + j) % 2 == 0){
                    count = count + 1;
                }
            }
        }



    }
}
