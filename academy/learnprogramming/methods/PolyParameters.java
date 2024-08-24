package academy.learnprogramming.methods;

import academy.learnprogramming.methods.Inheritance.Animal;
import academy.learnprogramming.methods.Inheritance.Cat;
import academy.learnprogramming.methods.Inheritance.Husky;
import academy.learnprogramming.methods.Inheritance.Rabbit;

public class PolyParameters {
    public static void main(String[] args) {
        
        Husky husky = new Husky(3);
        printDetails(husky);

        Rabbit rabbit = new Rabbit();
        rabbit.setName("bunny");
        // printDetails(rabbit);

        Cat cat = new Cat(2);
        cat.setName("tom");
        printDetails(cat);

        Animal rex = createAnimal("Rex", 4);
        printDetails(rex);

        Animal kitty = createAnimal("kitty", 3);
        printDetails(kitty);

        Animal bunny = createAnimal("Bunny", 2);
        printDetails(bunny);
        




    }

    // public static void printDetails(Husky husky){
    //     husky.printDetails();
    // }

    // public static void printDetails(Rabbit rabbit){
    //     rabbit.printDetails();
    // }

    public static void printDetails(Animal animal){
        animal.printDetails();
        
    }

    public static Animal createAnimal(String name, int age){
        if(name.equals("Rex")){
            Animal animal = new Husky(age);
            animal.setName(name);
            return animal;

        } else if(name.equals("kitty")){
            Animal cat = new Cat(age);
            cat.setName(name);
            return cat;
        }
        Rabbit rabbit = new Rabbit(age);
        rabbit.setName(name);
        return rabbit;
    }
}
