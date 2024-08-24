public class DoWhileLoop {
    public static void main(String[] args) {
        int a = 0;

        do {
            a++;
        } while(false);
        System.out.println(a);

        // does not compile
        // while(false){ 
        //     a++;     // unreachable
        // }
        int x = 20;

        while (x > 10) x--;
        System.out.println("x = " + x);

        int x2 = 20;


        do x2--;
        while (x2 > 10);
        System.out.println("x2 " + x2);

        int y = 10;
        int z = 5;

        while (y < 20)
        y++;
        z++;
        System.out.println("y = " + y+ ", z = " + z);

        int number = 10; 

        while(number > 10){
            number --;
        }

        do { 
            number--;
            while (number > 5){
                number -= 2;
            }
            
        } while (number > 10);

        System.out.println("number = " + number);

        // this will not compile because k is out of scope on line 54
        // k must be declared before the do while loop
        // do {
        //     int k = 1;
        //     System.out.println(y++ + " ");
        // } while(k <= 10);
    }
}
