// imports all packages in the class
import java.io.ObjectInputFilter;
import java.util.*;

import academy.learnprogramming.Config;
import tryingthis.a.b.c.d.*;



/**
 * after typeing Random I was able to import the class by hitting enter
 */
public class ImportExample {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println(random.nextInt(5));
        Example example = new Example();
        // Myclass myclass = new Myclass();
        Config.printConfig();
    }
}
