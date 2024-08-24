public class ObjectEquality {
    public static void main(String[] args) {
        // comparing objects
        Integer myInteger = 127;
        Integer myAnotherInteger = 127;

        System.out.println(myInteger == myAnotherInteger);

        System.out.println("128 == 128 " + (128 == 128));

        System.out.println(System.identityHashCode(myInteger));
        System.out.println(System.identityHashCode(myAnotherInteger));

        myInteger = 128;
        myAnotherInteger = 128;




        System.out.println("myInteger = " + myInteger);
        System.out.println("myAnotherInteger = " + myAnotherInteger);
        System.out.println(myInteger == myAnotherInteger);
        System.out.println(System.identityHashCode(myInteger));
        System.out.println(System.identityHashCode(myAnotherInteger));

        // Integer.valueOf(128);
        Integer int1 = Integer.valueOf(1);
        Integer int2 = Integer.valueOf(1);
        Integer int3 = 1;

        System.out.println("int1 == int2: " + (int1 == int2));
        System.out.println("int1 == int3: " + (int1 == int3));
        System.out.println("int2 == int3: " + (int2 == int3));

        System.out.println("int1.equals(int2)" + int1.equals(int2));
        System.out.println("int2.equals(int3)" + int2.equals(int3));
        System.out.println("int1.equals(int3)" + int1.equals(int3));

        String s = "23";
        System.out.println(Integer.parseInt(s) == 23);

        System.out.println(System.identityHashCode(int1));
        System.out.println(System.identityHashCode(s));
        System.out.println(System.identityHashCode(int3));
    }
}
