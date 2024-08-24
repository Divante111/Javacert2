public class AssignmentOperators {
    public static void main(String[] args) {
        //  int x = 1.0; // doesnt compile
        // short y = 19812345; 
        // int z = 9f;  
        // long t = 192038412312410; 


         int x = (int) 1.0; // compiles with modifications
        short y = (short) 19812345; 
        int z = (int) 9f;  
        long t = 192038412312410L; 


        System.out.println(x);
        System.out.println(y); // this is overflow when a number is too large to fit into datatype
        System.out.println(z);
        System.out.println(t);

        // overflow and underflow with byte (-128 to 127)

        byte myByte = 127;
        byte mySecondByte = -128;

        System.out.println(myByte);
        System.out.println(mySecondByte);

        myByte++;
        mySecondByte--;
        System.out.println();
        System.out.println(myByte);
        System.out.println(mySecondByte);

        short a = 10;
        short b = 20;

        short c = (short) (a * b);

        System.out.println(c);

    }
}
