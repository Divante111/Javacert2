package academy.learnprogramming.methods;

import academy.learnprogramming.methods.Inheritance.Animal;
import academy.learnprogramming.methods.Inheritance.Bird;
import academy.learnprogramming.methods.Inheritance.CanRun;
import academy.learnprogramming.methods.Inheritance.Cat;
import academy.learnprogramming.methods.Inheritance.Dog;
import academy.learnprogramming.methods.Inheritance.Eagle;
import academy.learnprogramming.methods.Inheritance.HasTail;
import academy.learnprogramming.methods.Inheritance.Husky;
import academy.learnprogramming.methods.Inheritance.Rabbit;
import java.util.ArrayList;
import java.util.List;

public class Polymorphism {
    public static void main(String[] args) {
        Husky husky = new Husky(5);
        husky.setName("rex");

        // this is called upcasting
        Dog dog = husky; // another reference to husky objject in memory

        // dog.printDetails(); // this is protected

        HasTail hasTail = husky; // anther referece to the same object
        System.out.println("Tail length = " + hasTail.getTailLength());

        CanRun canRun = husky;

        canRun.run(5);

        Animal animal = husky;

        // animal.printDetails(); // this is protected
        Object object = husky; // another reference to the same object
        

        Animal cat = new Cat(2);

        // Cat myCat = cat; // cannot convert animal to cat. 
        Cat myCat = (Cat)cat; // this is explicit casting
        ((Cat) cat).getSpeed();
        // myCat.getSpeed();
        // Animal.printName(); /// there is no print name method in animal
        // dog.printName(); // this is protected

        Husky mydog = (Husky) animal;
        mydog.printName(); 

        // Bear bear = (Bear)"test"; // not related in hierarchy

        // Dog newDog = (Dog) cat; // class cast exception

        // assinged to more than 2 types. itself and an object

        // bird is not polymorphic
        Bird bird = new Bird();
        Object birdObject = bird;

        Eagle eagle = new Eagle();
        Bird eagleBird = eagle;
        Object eagleObject = eagle;

        List<String> list = new ArrayList<>();


        Animal rabbitAnimal = new Rabbit();

        rabbitAnimal.printDetails();

    }
}
