package tryingthis.a.b.c.d;

public class DefaultInitialization {
    // primitives initialized outside of a class get default values char has one too.
    static boolean myBoolean;
    static byte myByte;
    static int myInt;
    static short myShort;
    static long myLong;
    static float myFloat;
    static double myDouble;
    static char myChar;

    public static void main(String[] args) {
        int localInt;
        // System.out.println("localInt = " + localInt); // must be initialized

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("myByte = " + myByte);
        System.out.println("myInt = " + myInt);
        System.out.println("myShort = " + myShort);
        System.out.println("myLong = " + myLong);
        System.out.println("myFloat = " + myFloat);
        System.out.println("myDouble = " + myDouble);
        System.out.println("myChar = " + myChar);


        
    }
    
}
