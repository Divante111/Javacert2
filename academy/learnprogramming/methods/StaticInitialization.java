package academy.learnprogramming.methods;

import java.util.ArrayList;
import java.util.List;

public class StaticInitialization {
    private static final int SIZE;

    private static int one;

    private static final int two;
    private static final int three = 3;

    private static final List<String> NAMES = new ArrayList<>();
    // private static final int four;

    static{
        System.out.println("first static init");

        int  rows = 5;
        int columns = 4;

        SIZE = rows * columns;
    }

    static{
        System.out.println("Second static init");
        one = 1;
        two = 2;
        one = three;
        // three = 2;

    }
    static {
        System.out.println("third static init");

        NAMES.add("jimmy");
        NAMES.add("Timmy");

    }
    
    public static void main(String[] args) {
        System.out.println(NAMES);
    }
}
