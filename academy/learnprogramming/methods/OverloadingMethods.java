package academy.learnprogramming.methods;

public class OverloadingMethods {

    public void walk(int miles){}

    public void walk(short feet){}
    public boolean walk(){
        return false;
    }
    void walk(int miles, short feet){}

    public void walk(float miles){}

    // public int walk(float miles){} // doesn't compile

    // public static void walk(float miles){} // won't compile

    public void walk(int[] lengths){

    }

    // public void walk(int... vars){}

    public static void run(int length){}
    public static void run(Integer length){}

    public static void run(double kilometers){}

    public static void jump(String s){}

    public static void jump(Object o){}


    // public static int sum(int a, int b){
    //     System.out.println("intsum =" + (a + b));
    //     return a + b;
    // }

    public static long sum(long a, long b){
        System.out.println("long sum" + (a + b));
        return a+b;
    }

    public static Integer sum(Integer a, Integer b){
        System.out.println("Integer Sum = " + (a + b));
        return a + b;
    }

    public static int sum(int... numbers){
        System.out.println("sum var args");
        int sum = 0;
        for(int num : numbers){
            sum+= num;
        }
        return sum;
    }

    public static void main(String[] args) {
        run(9L);
        jump("test");
        jump(25); // autoboxed to Integer type

        sum(1,2);

        

    }

    
}
