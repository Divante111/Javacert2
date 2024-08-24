package academy.learnprogramming.methods.Inheritance;


public class testingthis extends Animal2{
    public testingthis(){
        System.out.println("Horse");
    }

    public static void main(String[] args){
        new Animal2(5);
    }
}

class Animal2 {
    public Animal2(int age){
        System.out.println("Animal");
    }
}
