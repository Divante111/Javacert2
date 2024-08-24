package academy.learnprogramming.methods;

public class ClassConstructor {
    public static void main(String[] args) {
        Dog dog = new Dog("blue");
    
        dog.printColor();

        Cat cat = new Cat(10, 12);
        cat.printInfo();
    }
}

class Dog{
    private String color;

    public Dog(){}

    public Dog(String color){
        System.out.println("constructor");
        this.color = color;
    }
    public void printColor(){
        System.out.println("color = " + this.color);
    }
    // public dog(){} // wont compile
    // public void Dog(){} // not a constructor since it has a return type
}

class Cat{
    private String color;
    private int height;
    private int length;

    public Cat(int length, int height){
        // length = this.length; // will compile but will not change the this.length
        this.length = length;
        this.height = height;
        this.color = "white";
    }

    public void printInfo(){
        System.out.println("Cat length = " + this.length +"\nheight = " + this.height + "\ncolor = " + this.color);
    }

}


