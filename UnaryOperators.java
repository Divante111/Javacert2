public class UnaryOperators {
    public static void main(String[] args) {
        int x = +3; // plust sign is redundant

        System.out.println(x);

        double y = -x;

        System.out.println(y);

        y = -y;

        System.out.println(y);


        boolean a = true;

        boolean b = !a;

        System.out.println(" a = " + a + ", b = " + b);

        b = !b;
        System.out.println(" a = " + a + ", b = " + b);

        // int myInt = !5; // does not compile

        // boolean myBoolean = -true; // does not compile

        // boolean z = !0; // not operator cannot be applied to integers

        /// increment and decrement have higher order than (+, -, * , /)

        int myInt = 5;
        int otherInt = ++myInt;

        System.out.println("myInt= " + myInt + ", otherInt + " + otherInt);

        int newInt = 5;
        int newOtherInt = newInt++;
        System.out.println(newInt + ", " + newOtherInt);

        int count = 0;

        System.out.println(count);
        System.out.println(++count);
        System.out.println(count);
        System.out.println(count--);
        System.out.println(count);

        int e = 3;
        int f = ++e * 5 / e-- + --e;

        System.out.println("e = " + e + ", f = " + f);

        int g = 6;
        int h = 2;
        int i = ++h + --g * 3 + 2 * g++ - h-- % --g;



        System.out.println("g = " + g + ", h = " + h + ", i = " + i);
        System.out.println(3 % 5);



    }
}
