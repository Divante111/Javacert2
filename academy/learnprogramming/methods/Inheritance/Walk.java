package academy.learnprogramming.methods.Inheritance;

public interface Walk {
    default int getSpeed(){
        return 5;
    }
}
