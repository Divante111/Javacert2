import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList myList = new ArrayList();

        ArrayList<Object> myList2 = new ArrayList<Object>();

        // can enter type inside arraylist on the right side but it is not required
        ArrayList<String> list = new ArrayList<String>();

        ArrayList<String> list2 = new ArrayList<>();

        List<String> list3 = new ArrayList<>(); // useing interface as type

        //doest compile 
        // ArrayList<String> list4 = new List<>();

        // can specify initial capacity
        //arraylist automatically resizes
        List<String> list5 = new ArrayList<>(20);




    }
}
