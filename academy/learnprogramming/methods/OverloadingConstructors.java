package academy.learnprogramming.methods;

public class OverloadingConstructors {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Jimmy");
        dog1.print();
        Dog dog2 = new Dog("Anthony", "Shepard");
        dog2.print();
        Dog dog3 = new Dog("Rex", "German shepard", 40);
        dog3.print();
    }
}

class Dog{
    private String name;
    private String breed;
    private double weight;

    public Dog(String name){
        // this.name = name;
        // this.breed = "Husky";
        // this.weight = 30.0;
        // new Dog(name, "husky"); // compiles but creates a second instance of Dog
        this(name, "husky"); // must be the first constructor in statement body

    }
    public Dog(String name, String breed){
        // this.name = name;
        // this.breed = breed;
        // this.weight = 30.0;
        this(name, breed, 30.0);
        System.out.println("constructor 2");
    }
    public Dog(String name, String breed, double weight){
        this.name = name; 
        this.breed = breed;
        this.weight = weight;
        System.out.println("constructor 3");
    }

    public void print(){
        System.out.println(name + " " + breed + " " + weight);
    }
}

