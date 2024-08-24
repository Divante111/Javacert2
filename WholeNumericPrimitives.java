public class WholeNumericPrimitives {
    public static void main(String[] args) {
        // can use small letter l but it is not good practice
        // because it looks like the number 1
        // can use _ to make it easier to read
        long max = 321_321_414_955_525L;
        long n = 2_300;


        // base 8
        // octal numbers are numbers from (0 - 7)
        int oct = 8;

        int firstOct = 010; // 8 decimal
        int secondOct = 01110; 
        int thirdOct = 022; // 18 decimal
        System.out.println("******************");
        System.out.println(firstOct + thirdOct);
        System.out.println(Integer.toOctalString(firstOct + thirdOct)); // 26 decimal, 32 octal
        System.out.println("******************");

        //base 16
        // hexadecimal (0-9 and A-F)
        int firstHex = 0xF; // 15 decimal
        int secondHex = 0x1E; // 30 decimal
        int sumHex = firstHex + secondHex; // 45 decimal, 2d hex
        int tryingRandom = 0xFFF;
        System.out.println("first = " + firstHex + " second = " + secondHex);
        System.out.println("decimalSum = " + sumHex + " hexsSum = " + Integer.toHexString(sumHex));
        System.out.println(tryingRandom);

        // binary
        int firstBin = 0b1001; // 9 decimal
        int secondBin = 0b0111; // 7 decimal
        int sumBin = firstBin + secondBin; // 16 decimal, 10000 binary
    
        // int thirdBin = 0b2; can only use 0 or 1's
        System.out.println("first = " + firstBin + " second = " + secondBin);
        System.out.println("decimalSum = " + sumBin + " binSum = " + Integer.toBinaryString(sumBin));

    }
}
