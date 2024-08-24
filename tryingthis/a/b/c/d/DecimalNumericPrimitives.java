package tryingthis.a.b.c.d;

public class DecimalNumericPrimitives {
    public static void main(String[] args) {
        float myNumber = 25.4f;

        //underscore cannot be before decimal point
        // double before = 10_.25;

        // double after = 10._25; // doesnt compile if underscore is directly after decimal point

        // double first = _10.25; // cannot put an underscore before the number if choosing double

        // double last = 10.25_; // does not compile if _ is after the number.

        double myDouble = 2.54;

        double myDouble2 = 2.54f; // float gets converted to a double

        double anotherDouble = 2.45d; // d represents the number is a double uppercase or lowercase

        double scientific = 5.000125E03; // works with scientific notation
        double scientific2 = 5.000125E3; // works with scientific notation

        double myDouble3 = 5000.125; // equals same as above

        System.out.println("scientific = " + scientific);
        System.out.println("scientific2 = " + scientific2);
        System.out.println("myDouble3 = " + myDouble3);

        double hexPi = 0x1.91eb851fp1; // hexidecimal floating point number 
        System.out.println("hexPi = " + hexPi);


         
    }
}
