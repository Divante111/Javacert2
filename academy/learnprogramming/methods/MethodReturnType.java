package academy.learnprogramming.methods;



public class MethodReturnType {
    public void jump(){} // return type void

    public void jump2(){  // return type void
        return; // return is redundant
    }

    public String jump3(){
        return "";
    }

    // public String jump4(){} // must have return statement

    // public jump5(){} // doesn't have return type

    String jump6(int a){
        if(a == 5){
            return "";
        }
        return "abc";
    }

    int getInt(){
        return 9;
    }


    int getLong(){
        return (int) 9L;
    } 

    int expanded(){
        int temp = 10;
        // return temp;
        return 10;
    }

    boolean isTrue(){
        // return 5 < 10;
        return 5 == 5;
    }

    public void test(){}

    // public void 2test(){} //cant have number as first character

    // public void void(){} // cant use keywords for method names

    // public void public(){} // same as above

    public void $test(){}

    public void _test(){}

    // public void(){} // trying to use a keyword 






}
