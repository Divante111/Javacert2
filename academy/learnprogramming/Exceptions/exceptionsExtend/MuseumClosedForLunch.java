package academy.learnprogramming.Exceptions.exceptionsExtend;



public class MuseumClosedForLunch extends MuseumClosed{
    public static void main(String[] args) {
        try{
            visitMuseum();
        } 
        // catch (RuntimeException e){ /// cant run this because this is a superclass of all classes below
        //     System.out.println("runtime exception");
        // }
        catch (MuseumClosedForLunch mc){ // subclass
            System.out.println("Closed for lunch come back in two hours");
        }catch (MuseumClosed mc){ //Superclass
            System.out.println("Closed");
        }
        // catch (MuseumClosedForLunch mc){ // subclass doesn't compile because first class will handle both because of 
        //     System.out.println("Closed for lunch come back in two hours");
        // }c
        System.out.println(calculate());
    }

    public static String calculate(){
        String result = "";
        String str = null;

        try{
            try{
                result += "start";
                str.length();
                result += "end";
            } catch (NullPointerException e){
                result += "npe";
                throw new RuntimeException();
            } finally{
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e){
            result += "finished";
        }
        return result;
    }

    public static void visitMuseum(){
        Boolean b = Math.random() < 0.5;
        if (b){
            throw new MuseumClosed();
        }
        throw new MuseumClosedForLunch();
    }
}

class MuseumClosed extends RuntimeException{

}



