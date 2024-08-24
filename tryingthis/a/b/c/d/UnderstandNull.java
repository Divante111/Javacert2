package tryingthis.a.b.c.d;

public class UnderstandNull {

    static Object myObject = new Object();
    static Object myOtherObject; // by default this equals null
    static Object myOtherObject2 = null; //this is redundant

    static String myString;

    static int myInt = 0; // this is reduntant
    public static void main(String[] args) {
        Object myLocalObject = new Object();
        Object anotherLocalObject;

        String name = "Java";;
        String anotherName = null;
        
        System.out.println("myObject = " + myObject);
        System.out.println("myOtherObject = " + myOtherObject);

        System.out.println("myLocalObject = " + myLocalObject);
        // System.out.println("anotherLocalObject = " + anotherLocalObject); // cannot use this because it must be initialized if declared inside of a class

        System.out.println("name = " + name);
        System.out.println("anotherName = " + anotherName);

        System.out.println("myString = " + myString);
        myString = "Java";
        myString.toLowerCase();

        System.out.println("myString = " + myString);

    }
}
