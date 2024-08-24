package academy.learnprogramming.methods.Inheritance;

public class Rabbit extends Animal implements Herbivore, Hop{
    
    public Rabbit(){
        // super; // doesn't compile
        // super().setAge(3);  this doesn't compile because its looking in the super constructor for the method setAge();
        super();
        // these all work
        // super.setAge(3);
        // this.setAge(3);

        // setAge(5);
    }

    public Rabbit(int age){
        super(3);
        // this(age); // recursive call
        // this();
        // setAge(age);
        
    }

    @Override
    public int getWeight() {
        System.out.println("rabbit weight");
        return 1;
    }

    @Override
    public void printName() {
        System.out.println("I am a Rabbit");
    }

    @Override
    public void printDetails() {
        System.out.println("Rabbit average jump height is= " + Hop.getAverageJumpHeight());
    }
    
    
}
