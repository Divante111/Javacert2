package academy.learnprogramming.methods.Inheritance;

// can only have public abstract methods by default in interface
public interface HasTail {
    // public static final int DEFAULT_TAIL_LENGTH = 2; // public static and final are redundant in an interface
    int DEFAULT_TAIL_LENGTH = 2;

    // public int getTailLength(); // public is redundant every method inside of interface is public and abstract

    int getTailLength();

    // int getWeight(){} // cannot have methods that have body in abstract methods.
}
