package academy.learnprogramming.methods;


public class MethodArguments {
    int getZero(){ // 0 arguments (niladic)
        return 0;
    }
    
    int increment(int number){ // 1 argument (monadic)
        return number++;
    }

    int sum(int a, int b){ // 2 arguments (dyadic)
        return  a + b;
    }

    int plusMinus(int a, int b, int c){ // 3 arguments (triadic)
        return a + b - c;
    }

    double average(double a, double b, double c, double d){ // 4 arguments (polyadic)
        return (a + b + c + d )/ 4;
    }

    // void test{} // need brackets for arguments

    // void test(int a; int b){} // parameters must be separated by a comma

    void test(int a, int b){}

    // void test2(int a); // missing method body doesn't compile

    

}
