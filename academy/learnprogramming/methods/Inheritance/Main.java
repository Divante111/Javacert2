package academy.learnprogramming.methods.Inheritance;

public class Main {
    public static void main(String[] args) {
        Husky husky = new Husky(21);

        // Dog dog = new Dog(3);
        // dog.setName("Rex");
        // dog.printDetails();
        husky.eat();
        husky.setName("Rex");
        husky.printDetails();
        System.out.println("==============================");
        husky.setAge(6);
        System.out.println(husky.getAverageWeigth());
        

        husky.printName();
        System.out.println(husky.getWeight());
        System.out.println("==============================");
        husky.printDetails();
        System.out.println("tail length = " + husky.getTailLength());
        System.out.println();
        husky.run(10);
        // Animal animal = new Animal(); // can instantiate an abstract class 
        System.out.println("==============================");
        Bear bear = new Bear();
        bear.setName("jimmy");
        bear.setAge(10);
        bear.eatMeat();
        bear.eatPlants();
        bear.printDetails();
        System.out.println("==============================");
        Rabbit rabbit = new Rabbit();
        rabbit.eatPlants();
        rabbit.printDetails();
        System.out.println("==============================");
        Cat cat = new Cat(3);
        int speed = cat.getSpeed();
        System.out.println("Cat speed = " + speed);
        
    }
}
