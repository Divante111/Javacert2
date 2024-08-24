package academy.learnprogramming.methods.Inheritance;

public class Bear extends Animal implements Omnivore{

    @Override
    protected void printName() {
        System.out.println("bear");
    }

    @Override
    public int getWeight() {
        System.out.println("bear weight");
        return 2000;
    }

    @Override
    public void eatMeat() {
        System.out.println("Bear eats meat");
    }

    @Override
    public void eatPlants() {
        System.out.println("Bear eats plants");
    }
    
    
    
}
