public class StringImmutability {
    public static void main(String[] args) {
        String hello = "hello";

        String hi = hello + "world";

        hi = hello; // hi = hello
        System.out.println(hi + hello);// hellohello

        hello = hello.toUpperCase();

        System.out.println(hello);

        String s1 = "1";

        String s2 = s1.concat("2");

        s2 = s2.concat("3");

        System.out.println(s1);
        System.out.println(s2);

    }
}
