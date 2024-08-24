package academy.learnprogramming;

import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImportsExample {
    public static void main(String[] args) {
        int min = Math.min(5, 7);
        System.out.println("min = " + min);
        System.out.println(PI);
        out.println(PI);
    }
}
