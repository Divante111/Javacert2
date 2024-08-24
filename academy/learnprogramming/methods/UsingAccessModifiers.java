package academy.learnprogramming.methods;

import academy.learnprogramming.methods.common.Common;

public class UsingAccessModifiers {
    public static void main(String[] args) {
        Common common = new Common();
        common.publicPrint();
        // common.protectedPrint();
        // common.defalutPrint();
        // common.privatePrint();
        System.out.println("public number= " + common.publicNumber);
        // System.out.println("protected number= " + common.protectedNumber);
        // System.out.println("default number= " + common.defaultNumber);
        // System.out.println("private number= " + common.privateNumber);
    }
}
