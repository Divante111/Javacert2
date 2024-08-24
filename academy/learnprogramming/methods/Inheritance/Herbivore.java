package academy.learnprogramming.methods.Inheritance;

public interface Herbivore {
    default void eatPlants(){
        System.out.println("Eating plants");
    };



    // default in getRequiredPlantAmount(); // doesn't compile default method should have a body
    // public int getRequiredPlantAmount(){ // needs a default keyword
    //     return;
    // }
}
