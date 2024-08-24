public class NumbericPromotion {
    public static void main(String[] args) {
        // promotion is converting a smaller primitive type to a bigger primitive type

        int x = 5;
        double y = 10.5;
        System.out.println(" x + y = " + x + y); // we get 510.5 this is due to string concatenation

        System.out.println(" x + y = " + (x + y)); // we need to add the brackets to make the code do math

        double result = x + y;

        System.out.println(result);
        byte b = 10;
        int c = 5; 
        double d = 4.5;

        double result2 = b + c + d;

        System.out.println("result = " + result2);

        // ccasting is converting bigger type to smaller type

        double myDouble = 5.55;
        int myInt = 4 + (int) myDouble;

        System.out.println("result = " + myInt);

        int anotherInt = 125;
        byte myByte = 15;
        int intResult = anotherInt + myByte;

        byte byteResult = (byte) (anotherInt + myByte);

        System.out.println("result byte = "+ byteResult);
    }
}
