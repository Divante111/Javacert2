public class CompoundAssignmentOperators {
    public static void main(String[] args) {
        int x = 2;
        int z = 3;

        x = x * z; // simple assignment

        x *= z; // shorter form of line above

        System.out.println("x = " + x);

        // int a += 5;  this doensn't compile

        // without explicit cast

        long a = 10; 
        int b = 4;
        // b = b * a;  doesnt compile the multiplication turns the product to a long because long is larger than an int and you are trying to store
        //  the value inside of int b;


        // b = (int) (b * a);
        b*=a; // this line does the same thing as the above line

        System.out.println("b = " + b);

        long c = 4; 
        long d = (c=2);

        System.out.println(("c = " + c + ", d = " + d));

        long e = 3;
        long f = 2;
        long h = 1;
        long i = e + 3 * (f = 3) - (h-=2);

        // 3+ 3 * 3 - -1
        // 3 + 9 + 1
        //i = 13
        // h = -1
        //f = 3


        System.out.println("e = " + e + ", f = " + f + " h = " + h + " i = " + i);
    }
}
