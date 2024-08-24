import java.math.BigInteger;

/**
 * 
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        int result = 3 - 2 + 2 * 2 + 3;
        System.out.println("result = " + result);


        result = 4 / 2 + 1 - 4 * 2 + 10;
        System.out.println("result = " + result);

        int a = 4;
        int b = 3 - 2 * a--;


        System.out.println(b);

        long c = 2;
        long d = 4 + 3 * c++;
        System.out.println(d);
        System.out.println(c);
        long superLong = 9223372036854775807L * 9223372036854775807L;
        System.out.println(superLong);
        BigInteger bigNum1 = new BigInteger("9223372036854775807");
        BigInteger bigNum2 = new BigInteger("9223372036854775807");
        
        BigInteger theResult = bigNum1.multiply(bigNum2);
        System.out.println(theResult);

        int i = 10;;
        int j = 3;
        int k = i % j;
        int e = 10 % 2;

        System.out.println(k);
        System.out.println(e);

        int f = 12;
        int g = 5;
        int h = 2;


        int m = f / 2 - 10 % (4 + 3) - 2 * f % g - h * 3;
        // 6 - 3 - 4 - 6
        // 3 - 4 - 6
        // -1 - 6
        // -7

        System.out.println(m);


    }
}
