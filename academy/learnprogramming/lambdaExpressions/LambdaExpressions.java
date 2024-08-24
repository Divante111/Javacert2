package academy.learnprogramming.lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExpressions {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("rabbit", true,  false));
        animals.add(new Animal("dog", true, true));

        // print(animals, new CheckCanJump());
        System.out.println("\n\n");
        print(animals, animal -> animal.isCanSwim());
        print(animals, animal -> !animal.isCanSwim());

        print(animals, (Animal animal) -> animal.isCanSwim());

        print(animals, (Animal animal) -> {
            // Animal animal = new Animal("cat", true, false);
            System.out.println("checking animal = " + animal.getType());
            return animal.canJump();
        });

        Animal fish = animals.get(0);
        Animal rabbit = animals.get(1);
        Animal dog = animals.get(2);


        print(fish, rabbit, (first, second) -> first.isCanSwim() && second.isCanSwim());
        print(fish, dog, (first, second) -> first.isCanSwim() && second.isCanSwim());

        List<String> names = new ArrayList<>();
        names.add("john");
        names.add("Anthony");
        names.add("Jimmy");
        names.add("Timmy");
        System.out.println("names before = " + names);
        
        names.removeIf(name -> name.charAt(0) == 'J');
        // names.removeIf((String str) -> {
        //     return str.charAt(0) == 'J';
        // });
        System.out.println("name after = " + names);


    }


    private static void print(List<Animal> animals, Predicate<Animal> filter){
        for(Animal animal : animals){
            if(filter.test(animal)){
                System.out.println(animal.getType());
            }
        }
    }   

    private static void print(Animal first, Animal second, AnotherCheck check){
        System.out.println(check.check(first,second));
    }
}



class Animal {
    private String type;
    private boolean canJump;
    private boolean canSwim;



    public Animal(String type, boolean canJump, boolean canSwim){
        this.type = type;
        this.canJump = canJump;
        this.canSwim = canSwim;
    }

    public boolean canJump(){
        return canJump;
    }

    public boolean isCanSwim() {
        return canSwim;
    }

    public String getType(){
        return type;
    }


}
interface CheckAnimal{// this is called a functional interface
    boolean check(Animal animal);
}

class CheckCanJump implements CheckAnimal{

    @Override
    public boolean check(Animal animal) {
        return animal.canJump();
    }
}

interface AnotherCheck{
    boolean check(Animal first, Animal second);
}
