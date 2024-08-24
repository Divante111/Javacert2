package academy.learnprogramming.Exceptions;

public class CatchWithReturn {
    public static void main(String[] args) {
        System.out.println(calculate());
    }

    public static int calculate(){
        try {
            return 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("error");
            System.exit(0); // this stops everything and no return statment is executed
            return 1;
        } finally{
            System.out.println("finally");
            return 0; // even though the catch has a return statement finally always executes
        }
    }
}
