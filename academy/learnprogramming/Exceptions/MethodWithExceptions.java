package academy.learnprogramming.Exceptions;

public class MethodWithExceptions {
    public static void main(String[] args) {
        Bear bear = new Bear();
        try {
            bear.eatMeat(-2);
            bear.eatPlants(-2);
        } 
        // catch (RuntimeException e){
        // }
        catch (NoMorePlansException e) {
            e.printStackTrace();
            System.out.println("No plants");
        }catch (RuntimeException e){
            System.out.println("Runtime");
        }
        catch (NoMoreMeatException e) {
                e.printStackTrace();
                System.out.println("Bear is hungry");
            } 
        finally{
            System.out.println("finally");
        }
        // bear.eatPlants(-2);
    }

    
}

class NoMoreMeatException extends Exception{

}

class NoMorePlansException extends RuntimeException{

}

interface Omnivore{
    void eatMeat(int amount)throws NoMoreMeatException;
    void eatPlants(int amount);
}

class Bear implements Omnivore{

    @Override
    public void eatMeat(int amount) throws NoMoreMeatException{
        if(amount <= 0){
            throw new NoMoreMeatException();
        }
        System.out.println("eating meat");
    }

    @Override
    public void eatPlants(int amount) {
        if(amount <= 0){
            throw new NoMorePlansException(); /// no more plans exception extends runtimeException and exception checking is not required
        }
        System.out.println("eating plants");
    }

    
    
}
