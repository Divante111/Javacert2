package academy.learnprogramming.methods.common;

public class Common {
    public int publicNumber = 10;
    protected int protectedNumber = 20;

    int defaultNumber = 30;
    private int privateNumber = 40;
    public void publicPrint(){
        System.out.println("public");
    }

    protected void protectedPrint(){
        System.out.println("protected");
    }

    void defaultPrint(){
        System.out.println("default");
    }

    private void privatePrint(){
        System.out.println("private");
    }

    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        common.protectedPrint();
        common.defaultPrint();
        common.privatePrint();
        System.out.println("public number= " + common.publicNumber);
        System.out.println("protected number= " + common.protectedNumber);
        System.out.println("default number= " + common.defaultNumber);
        System.out.println("private number= " + common.privateNumber);
        
    }
}
