package academy.learnprogramming.methods.Inheritance;

public class Cat extends Animal implements Walk{
    public Cat(int age){
        super(age);
    }

    @Override
    public int getWeight() {
        System.out.println("cat noises");
        return 5;
    }

    @Override
    public void printName() {
        System.out.println("I am a cat");
    }

    // @Override
    // public int getSpeed() {
    //     return 15;
    // }
    
    
}
