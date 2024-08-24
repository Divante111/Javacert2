import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class SearchingList {
    public static void main(String[] args) {
        List<String> numbsList = new ArrayList<>();
        numbsList.add("500");
        numbsList.add("10");
        numbsList.add("9");
        numbsList.add("50");
        numbsList.add("40");
        System.out.println(numbsList);

        int index = Collections.binarySearch(numbsList, "10");
        System.out.println(index);
        Collections.sort(numbsList);
        index = Collections.binarySearch(numbsList, "10");
        System.out.println("------------------------------------");
        System.out.println(numbsList);
        System.out.println(index);

        System.out.println("------------------------------------");
        List<Integer> numbers = Arrays.asList(5,4,8,10,11,7,3);
        Collections.sort(numbers);

        index = Collections.binarySearch(numbers, 7);
        System.out.println(numbers);
        System.out.println(index);
    }
}
