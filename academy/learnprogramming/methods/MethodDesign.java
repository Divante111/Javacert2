package academy.learnprogramming.methods;



public class MethodDesign {

    public void jump(){}
    
    // void public jump2(){} //compile time error return type always comes before method name

    void jump3(){
        // this is a private method by default because it doesn't contain an access modifier
    }

    public final void jump4(){
        // compiles with final or without final
    }

    public static final void jump5(){

    }

    public final static void jump6(){

    }

    // public modifier void jump7(){} // modifier is a random word and wont compile

    // public String void jump8(){} // cannot specify two or more return types

    final public void jump9(){} // final can come before everything

    final static public void jump10(){} // will still compile as long as access modifier is before return type

    // String int public void jump11(){} // cant return different types from the same method

    

}
