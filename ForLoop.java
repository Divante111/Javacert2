public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        System.out.println();
        int a;
        for(a = 0; a < 10; a++){
            System.out.println("a = " + a);
        }
        System.out.println();
        System.out.println("a " + a);
        
        // endless for loop
        // for(;;){
        //     System.out.println("this will never end");
        // }

        int x = 0;
        for (int y = 0, z = 4; x < 5 && y < 10; x++, y++){
            System.out.println("y = " + y);

        }
        System.out.println( "x = " + x);

        int d = 10;
        // this wont compile because we are trying to redeclare variable d again
        // int (e = 0, d = 0; e < 10 || d < 10; e++, d--){

        // }

        //wont compile cant use different datatypes (long , int)
        // for (long z = 0 , int d = 4; z < 10; z++, d++ ){

        // }

        for (long z = 0; z < 10;z++){}

        for(double xy=0.0; xy < 10.5; xy++){}

        // infinite for loop
        for(int i = 0; i <10;){
            i = i++;
            System.out.println("hello world");
        }
    }

}
