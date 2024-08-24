package academy.learnprogramming.methods.Inheritance;

public abstract class Animal extends Object{

    private int age;
    private String name;

    public Animal(){}

    
    public Animal(int age){
        System.out.println("Animal");
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void printDetails(){
        System.out.println("name = " + this.getName() + "\nAge = " + this.getAge());
        printName();
        System.out.println("Age = " + age);
    }

    public void eat(){
        System.out.println("Animal is eating");
    }

    public double getAverageWeigth(){
        return 10.0;
    }

    // public static abstract void run(){} // method ccannot be static and abstract at the same time

    // public abstract void run(){} // abstract methods cannot have a body

    public abstract int getWeight(); // this is an abstract method that runs without a body

    protected abstract void printName();

}
