package academy.learnprogramming.methods.Inheritance;

public interface Carnivore {
    default void eatMeat(){
        System.out.println("Eating meat");
    };
}
