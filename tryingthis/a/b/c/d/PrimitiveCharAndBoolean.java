package tryingthis.a.b.c.d;

public class PrimitiveCharAndBoolean {
    public static void main(String[] args) {
        char ch = 'a';

        // char ch1 = 'ab'; // cant compile because too many characters

        char ch1 = '1'; // this works because this represents a character

        char uniChar = '\u0389'; //unicode characters can be used a char datatype. // uppercase greeek omega character

        char romanNumber = '\u216c'; // roman 50 number;

        System.out.println("ch1 = " + ch1);

        // these show up as ? because the  compiler doesn't have the charcters in terminal

        System.out.println("uniChar = " + uniChar);
        System.out.println("romanNumber = " + romanNumber);

        boolean myBoolean = true;
        boolean myFalseBoolean = false;

        System.out.println("myBoolean = " + myBoolean);
        System.out.println("MyFalseBoolean = " + myFalseBoolean);
        
        // boolean true = false; // cant compile
    }
}
