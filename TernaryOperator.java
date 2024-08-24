public class TernaryOperator {
    public static void main(String[] args) {
        int x = 10;
        int y;

        if(x > 5) y = 2 * x;
        else y = 4 * x;
     

        System.out.println("y = " + y);

        //ternary operator

        y = x > 5 ? 2 * x : 4 * x;
        y = (x > 5) ? (2 * x) : (4 * x);
        System.out.println("y=" + y);

        // not same datatype example
        y = 1;
        System.out.println(y > 5 ? 10 : "test");
        // int myInt = y < 10 ? 5 : "test"; // doesnt compile because string might be trying to be assigned to an 
        
        int a = 1;
        int b = 1;
        int c = a < 10 ? a++ : b++;
        System.out.println(a + " " + b  + " " + " " + c);

        int d = 1;
        int e = 2;
        int f = 3;

        if (d < 10) {
            f = d++ < 1 ? e++ : f++;
        }else{
            f = (d+e) < 2 ? d++ : e++;
        }
        System.out.println(d + ", " + e  + ", " + f);

        System.out.println(x > 2 ? x < 4 ? 10: 8 : 7);
    }
}
