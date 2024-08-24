package tryingthis.a.b.c.d;

public class VariableScope {

    static int myNewInt;
    public static void main(String[] args) {
        int myLocalInt = 10;


        {
            {
                int myOtherInt = 10;
                {
                    int myOtherInt2 = 20;
                }
            }
            int myOtherInt = 20;
            int anotherInt = 30;
            System.out.println("myOtherint= " + myOtherInt);// this is only available inside of this codeblock
            System.out.println("myLocalInt= " + myLocalInt); // has access to this because code block is inside the codeblock where this is declared
        }
        // System.out.println("myOtherint= " + myOtherInt); this will not work

        System.out.println("myNewInt= " + myNewInt); // global variables can be used anywhere
        int myOtherInt = 30;

        System.out.println("myOtherInt= " + myOtherInt);

        int anotherInt = 40;
        System.out.println("anotherInt= " + anotherInt);
        
    }

    public static void myMethod(){
        
    }
}
