package academy.learnprogramming.methods.Inheritance;

// classes can implement multiple interfaces
public abstract class Dog extends Animal implements HasTail, CanRun{
    public Dog(int age){
        super(age);
        System.out.println("Dog");
        
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Dog eating");
    }
    
    // public double getAverageWeigth(){} // cant overide final method
    
    @Override
    public double getAverageWeigth(){
        // return 30;
        return super.getAverageWeigth() + 20; 
    }

    @Override
    public int getTailLength() {
        return 20;
    }

    
    

    // @Override
    // public int getWeight() {
    //     // TODO Auto-generated method stub
    //     System.out.println("This is from the dog class");
    //     return 30;
    // }
}
