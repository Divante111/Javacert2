package academy.learnprogramming.methods.common;

public class Beetle extends Insect{
    int getNumberOfLegs(){return 6;}
}
interface Shell{
    abstract int getNumberOfSections();

}
abstract class Insect implements Shell{
    abstract int getNumberOfLegs();
}
