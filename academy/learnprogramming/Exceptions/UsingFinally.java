package academy.learnprogramming.Exceptions;

public class UsingFinally {
    public static void main(String[] args) {
        String[] array = new String[5];
        array[0] = "john";
        
        try{
            String element = firstToUppercase(array);
            System.out.println(element);
        } catch (NullPointerException e){
            System.out.println("Error message = " + e.getMessage());

        } finally {
            System.out.println("finally block");
        }
        
        String str = "";
        try {
            int result = 10 / 0;
            str += "a";
        } catch (Exception e) {
            str += "b";
        }finally{
            str += "c";
        }
        str += "d";
         System.out.println(str);
    }
    public static String firstToUppercase(String[] array){
        return array[0].toUpperCase();
    }
}
