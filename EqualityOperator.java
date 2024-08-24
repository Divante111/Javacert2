public class EqualityOperator {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        boolean c = a == b; // false

        boolean d = a != b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // boolean g  = true == 0; // doesnt compile
        // boolean h = false != "test"; // doestn compile

        boolean x = true;
        boolean y = false;
        boolean z = (y = true) && (x = false);

        System.out.println("x = " + x);
        System.out.println("y = " +y);
        System.out.println("z = " +z);

        
    }
}
