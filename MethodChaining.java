public class MethodChaining {
    public static void main(String[] args) {
        String start = "  Java  ";
        System.out.println(start);
        String trimmed = start.trim();
        System.out.println(trimmed);
        String lowerCase = trimmed.toLowerCase();
        System.out.println(lowerCase);

        String result = lowerCase.replace("J", "j");
        System.out.println(result);

        String anotherResult = "   Java   ".trim().toLowerCase().replace("J", "j");
        System.out.println(anotherResult);
        System.out.println(result.equals(anotherResult));


        String a = "abc";
        String b = a.toUpperCase(); // produces new string doesnt change a variable
        String c = b.replace('B', 'b').replace('C', 'c');

        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        if (a.equalsIgnoreCase(b)){
            System.out.println("Strings are equal");
        }
        if(a.toLowerCase().trim().equals(b.toLowerCase().trim())){
            System.out.println("Equal");
        }
    }
}
