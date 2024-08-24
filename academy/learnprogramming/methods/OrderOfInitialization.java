package academy.learnprogramming.methods;

public class OrderOfInitialization {
    public static void main(String[] args) {
        Example example = new Example();
        new Demo();
    }
}

class Example{
    private String name = "dog";

    {
        System.out.println(name);
    }
    private static int COUNT = 0;

    static{
        System.out.println(COUNT);
    }

    {
        COUNT += 10;
        System.out.println(COUNT);
    }
    
    public Example(){
        System.out.println("constructor");
    }
}

class Demo{

    static {
        add(2);
    }
    static void add(int number){
        System.out.println(number + " ");
    }

    Demo(){
        add(5);
    }

    static {
        add(4);
    }
    {
        add(6);
    }
    static {
        new Demo();
    }

    {
        add(8);
    }
    
}

