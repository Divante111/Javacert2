public class StringConcatenation {
    public static void main(String[] args) {
        String text = "hello";
        String anotherText = new String("hello");

        System.out.println( 1 + 2 + "d");
        System.out.println( "d" + 2 + 1);

        int three = 3;
        String four = "4";

        System.out.println(1 + 2 + three + four);

        int number = 10;
        int anotherNumber = 20;
        System.out.println("result = " + number + anotherNumber);
        System.out.println("result = " + (number + anotherNumber));

        String str = "";

        for (int i = 0; i < 10; i ++){
            str += i + " ";
        }
        System.out.println(str);
        String hello = "hello";

        String world = "world";
        String helloWorld = hello + world;

        System.out.println(hello);
    }
}
