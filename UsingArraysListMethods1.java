import java.util.ArrayList;
import java.util.List;

public class UsingArraysListMethods1 {
    public static void main(String[] args) {
        
        List<Object> list123 = new ArrayList<>();

        //this works the same as the line above
        // this also gives a warning
        List list = new ArrayList();
        list123.add("dog");
        list123.add(5);

        System.out.println(list123);

        list.add("dog");
        list.add(5);

        System.out.println(list);

        List<String> pets = new ArrayList<>();

        pets.add("dog");
        System.out.println(pets);

        pets.add(0, "cat");
        System.out.println(pets);

        pets.add(1, "parrot");
        pets.add(0, "husky");
        pets.add(1, "bird");
        System.out.println(pets);

        //remove method

        pets.remove("parrot");
        System.out.println(pets);

        pets.remove(2);
        System.out.println(pets);

        pets.set(0, "newBird");
        System.out.println(pets);

        // there is no index 6
        // pets.set(6,"randomDog"); // index out of bounds

    }
}
