public class UnderstandingEquality {
    public static void main(String[] args) {
        StringBuilder one = new StringBuilder();
        StringBuilder two = new StringBuilder();
        StringBuilder three = one.append("Java");

        System.out.println(one == two);
        System.out.println(one == three);
        
        String x = "Java";
        String y = "Java";
        System.out.println(x == y);

        String a = "Java";
        String b = " Java".trim(); // creates a new string method so it is outside of hte string pool
        System.out.println(a == b);

        String c = "Java";
        String d = " Ja".trim() + "va";
        System.out.println(c == d);

        String cc = "4" + 3;
        String cec = 4 + "3";
        System.out.println(cc);
        System.out.println(4 + "3");

        //cannot compare string and sting builder
    }

}
