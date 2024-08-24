package tryingthis.a.b.c.d;

public class WrapperTypes {
    public static void main(String[] args) {
        int myInt = 10;

        // these are all wrapper types
        

        // Integer myInteger = new Integer(10); // depreciated
        // Integer myInteger = new Integer.valueOf(10); // this doesnt work
        Integer myInteger = Integer.valueOf(10); // this is boxing and is unnecessary you can use the line below to get the same result
        Integer myInteger2 = 20;
        Integer myInteger3 = Integer.parseInt("3");
        Integer myInteger4 = null;
        // int myInt2 = null; // will not compile

        System.out.println("myInteger = " + myInteger);
        System.out.println("myInteger2 = " + myInteger2);
        System.out.println("myInteger3 = " + myInteger3);
        System.out.println("myInteger4 = " + myInteger4);

        // Converting wrapper to primitive - unboxing
        int myInt3 = myInteger3; // unboxing
        

        // boxing is converting primitive to wrapper
        Integer myInteger5 = Integer.valueOf(10);

        // converting primitive to wrapper
        Integer myInteger6 = myInt;

        Integer myInteger7 = null;
        // will produce null pointer exception like this
        // int myInt4 = myInteger7; // throws null pointer exception primitives cant contain null


        printSum(1, 5); // this is called autoboxing


        printSum(myInteger, myInteger2); // not autoboxing 

        // short myPets = 5; // this works
        // int myNumber = 5.6; // cant assign a double to an int
        // String theString = "Scruffy"; // this works
        // myPets.length(); //  cant use .length on a short
        // myNumber.length(); // cant use .length on a int trying to initilize as a double
        // theString.length(); // this works
        

        
    }

    private static void printSum(Integer first, Integer second){
        Integer sum = first + second;
        System.out.println("sum = " + (first + second));
        System.out.println("sum = " + sum);

       
    }
}
