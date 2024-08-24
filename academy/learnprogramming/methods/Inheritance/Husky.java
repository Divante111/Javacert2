package academy.learnprogramming.methods.Inheritance;

public class Husky extends Dog{
    public Husky(int age){
        super(age);
        System.out.println("Husky");
    }

    @Override
    public void eat() {
        // super.eat();
        System.out.println("Husky eating");
        super.eat();
    }

    @Override
    public void printName() {
        
        System.out.println("Husky name = " + getName());
    }

    @Override
    public int getWeight() {
        System.out.println("weight from dog class");
        return 30;
    }

    @Override
    public int getTailLength() {
        return 5;
    }

    @Override
    public void run(int speed) {
        System.out.println("Husky is running at speed " + speed);
    }
    


    
}
