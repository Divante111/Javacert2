public class StringMethods {
    public static void main(String[] args) {
        String str = "java is fun";

        //length
        System.out.println("length = " + str.length());

        //char at
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(6));
        System.out.println(str.charAt(10));
        System.out.println("===================================");

        // index of
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf('a', 2));
        System.out.println(str.indexOf("fun", 10)); // -1 match not found
        System.out.println(str.indexOf("fun"));

        // str = str.substring(8);
        System.out.println(str.substring(8));
        System.out.println(str.substring(0,5));
        System.out.println(str.substring(4,4));//empty string
        // System.out.println(str.substring(4,2));// out of range
        System.out.println("AbCd".toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str);

        String dog = "Lucky";
        // dog.toUpperCase();
        dog = dog.toUpperCase();
        System.out.println(dog);

        
    }
}
