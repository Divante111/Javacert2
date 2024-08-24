package tryingthis.a.b.c.d;

public class DeclaringAndInitializingVariables {
    public static void main(String[] args) {
        // declairing and initializing in two lines
        // declaration
        int myNumber;
        // System.out.println("myNumber = " + myNumber); // must be initialized to print
        //initialization
        myNumber = 10;

        System.out.println("myNumber = " + myNumber);

        double myDouble = 7.50;
        System.out.println(myDouble);

        // can declare variable in the same line 
        float myFloat1, myFloat2, myFloat3;

        // can also declare variables like this
        float myfloat4; float myFloat5;

        //this will also compile
        float myFloat6 = 5f, myFloat7 = 10f, myFloat8;

        boolean b1, b2;

        // can't have multiple types in one line separated by a comma.
        // double d1, double d2;

        int i1;
        int i2;

        // int i3; i4; // does not compile

        // int int; will not compile 

        // int int = 10; will not compile

        char cHaR; // dont do this 

        char Char; // dont do this

        float okFloat;
        double $Ok2Double; // this will compile can start with dollarsign

        double _alsoDouble; // this works

        float __OkButNotNice$_123;

        // illegal examples

        // double 3Dpoint; cant start with a number
        // double my@street; cant have @ symbol inside
        // float *$coffee; // cant have * in variable name

        // float double;

        // double public; 



   
    }
}
