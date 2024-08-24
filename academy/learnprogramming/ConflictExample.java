package academy.learnprogramming;

/**
 * using a * in the imports does not slow down program.
 * java will chose what is needed.
 */
public class ConflictExample {
    public static void main(String[] args) {
        java.util.Date date;
        // instead of importing you can go all the way down to the class you need.
        // using full class name is what this is called
        java.sql.Date sqlDate;
        
    }
}
