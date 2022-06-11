package looping;

public class forLoop {
    public static void main(String[] args) {
        for(int i=1;   i<=10;  i++)
            System.out.println("dallas");
        for
        (
                int i=1;
                i<=5;
                i++
        )
            System.out.println("Dallas");


        for (int i =2 ; i<=12 ; i++)
            System.out.println("TX");



        int n;
        n=5;
        n++; // n = n+1 // here only 1 will increment

        n+=1; // n= n+1  // here, any number increment is possible
        n+=5; // n = n+5

        n*=2; // n= 12*2


        System.out.println(n);


        int a;
        a=6;

        a= a% 4 ; // % is called modulus or remainder

        System.out.println(a);


        int x;
        x= 4;

        if (x%2 == 0)
            System.out.println("It is even number");
        if ( x%2 == 1)
            System.out.println("It is odd number ");


        int time = 20;
        String result;
        result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        // print 8 times new york
        for(int i=1;   i<=8;  i++)
            System.out.println("New York");




        // Looping
        // Req: Print Dallas 3 Time
        // repeated job

//				run below line 10 times


        for(
                int
                i=1;
                i<=10;
                i++)
            System.out.println("s");


    }


}
