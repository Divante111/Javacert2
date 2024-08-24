
/**
 * 
 */
public class Main {
    //type psvm to get main
    // psvm = public static void main
    //type sout then hit tab to auto generate the system out println
    // below is a javadoc comment it starts with /** and ends with */
    /**
     * 
     * This is main method
     * @param args comment line arguments
     */
    public static void main(String[] args) {
        System.out.println("args-size = " + args.length);

        /* printing arguments
         * another line
         */
        for(int i = 0; i < args.length; i++){
            System.out.println("args[" + (i + 1)+ "] = " + args[i]);
        }
        // sum();
    }
    /**
     * Sum of two integers
     * @param a operand
     * @param b operand
     * @return sum
     */
    public static int sum(int a, int b){
        return a + b;
    }
}
