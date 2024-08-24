package academy.learnprogramming.methods;

public class PassingDataBetweenMethods {
    public static void main(String[] args) {
        int number = 4;
        System.out.println("number=" + number);
        newNumber(number);
        System.out.println(number);

        String name ="Jimmy";
        System.out.println("name=" + name);
        newName(name);
        System.out.println("name= " + name);

        StringBuilder sb = new StringBuilder();
        build(sb);

        System.out.println("Stringbuilder = " + sb);
        // StringBuilder s = sb;
        // s.append("Anthony");

        // System.out.println("s = " + s);
        System.out.println("sb = " + sb);
    }

    public static void newNumber(int number){
        System.out.println("in newNumber=" + number);
        number = 10;
        System.out.println("in newNumber=" + number);
    }

    public static void newName(String name){

        System.out.println("in newName name = " + name);
        name = "Timmy";
        System.out.println("in newName name = " + name);
    }

    public static void build(StringBuilder s){
        s = new StringBuilder();
        s.append("tom");
    }
}
