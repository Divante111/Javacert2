


public class ConditionalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = a && b;
        boolean e = a || b;
        System.out.println(d);
        System.out.println(e);


        int f = 4;
        boolean g = false && (f++ < 4);// f ++ < 4 is never executed because the first value is false (short-ciruting)
        System.out.println(f);

        boolean h = (f-- == 4) && !g;

        //f == 3
        // g == false;
        // h == true;
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        int myInt = 3;
        int anotherInt = 4;
        boolean myBoolean = (myInt <= 3)  && (anotherInt-- == 4) || (myInt++ == 4);// because the first section of this is true the second half after the || operator is never run
        System.out.println("myint = " + myInt);
        System.out.println("anotherint = " + anotherInt);

        System.out.println("myboolean = " + myBoolean);

        boolean x = true, z = false;
        int y = 20;
        x = (y != 10) ^ (z = false);
        System.out.println("x = " +x + " y = " + y + " z= " + z);
    }
}
