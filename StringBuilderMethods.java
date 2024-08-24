public class StringBuilderMethods {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("programming");

        String sub = sb.substring(sb.indexOf("g"), sb.indexOf("mi"));
        System.out.println(sub);
        int len = sb.length();
        System.out.println(len);
        char ch = sb.charAt(5);
        System.out.println(ch);

        StringBuilder b = new StringBuilder().append(1).append("L");

        System.out.println(b);
        b.append("-").append(true);
        System.out.println(b);


        StringBuilder builder = new StringBuilder("programming");
        builder.insert(7, "-");
        builder.insert(2, 2);
        System.out.println(builder);

        builder.delete(4, 9);
        System.out.println(builder);
        builder.deleteCharAt(2);
        System.out.println(builder);
        builder.delete(1,1); // this deletes nothing
    
        System.out.println(builder);

        StringBuilder sb1 = new StringBuilder("ABC123");
        sb1.reverse();
        System.out.println(sb1);

        String myString = sb1.toString(); // converting stringbuilder to String

        myString = myString.toLowerCase();
        System.out.println(myString);
    }
}
