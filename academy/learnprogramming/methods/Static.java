package academy.learnprogramming.methods;

public class Static {

    private String name = "Static";

    public static void one(){}

    public static void two(){}
    public static void three(){
        one();
        two();
        // System.out.println(name);
    }

    public void four(){
        one();
        two();
        three();
        System.out.println(name);
    }

    public static void main(String[] args) {
        Static.one();
        one();
        two();
        three();
        
        Static myInstance = new Static();

        myInstance.four();

        new Static().four();

        
    }
}
