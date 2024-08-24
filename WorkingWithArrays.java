
import java.util.Arrays;

public class WorkingWithArrays {
    public static void main(String[] args) {
        int[] one = new int[3]; // all elements initialized to 0
        int[] two = new int[]{10,11,12}; // array with 3 elements initilized

        // double[] a = new double[2.55]; // cant have half an element

        double[] b = new double[4*5/2]; // creates array with 10 elements

        int x = 4;
        int y = 4;

        double[] c = new double[x * y]; // creates empty arrya with 16 elements

        int[] three = {10,11,12}; // anonymous array because we dont specify type on the right side
        int[] four = {};// size will be 0 anonymous array

        int[] a1;
        int[] a2;
        int a3[];
        int a4[];

        int[] ids, types; //creates two arrays
        int ids2[], types2; // this creates an array and an int; bad practices

        String[] animals = {"parrot", "dog", "cat"};

        String[] myAnimals = animals;

        String[] otherAnimals = {"parrot", "dog", "cat"};

        System.out.println(animals.equals(myAnimals));
        System.out.println(animals == myAnimals);

        System.out.println(System.identityHashCode(animals));
        System.out.println(System.identityHashCode(myAnimals));

        System.out.println(animals.equals(otherAnimals));
        System.out.println(animals == otherAnimals);
        System.out.println(Arrays.equals(animals, otherAnimals));

        System.out.println(animals);
        System.out.println(animals.toString());
        
        System.out.println(Arrays.toString(animals));




    }
}
