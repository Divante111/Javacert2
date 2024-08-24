import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratingList1 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        for(int i = 0; i < numbers.size(); i++){
            System.out.println("element at index " + i + " is " + numbers.get(i));
            // numbers.remove(2); // index out of bounds
        }

        // for (Integer number : numbers) { //java.util.ConcurrentModificationException // cant remove and iterate at the same time using foreach loop
        //     System.out.println("numbers = " + number);
        //     numbers.remove(2);
        // }

        for(Iterator<Integer> iterator = numbers.iterator(); iterator.hasNext();/**here we would normally specify the increment operator */){
            Integer number = iterator.next();
            System.out.println(number);
            iterator.remove();// removes the current item
        }
        System.out.println(numbers);

        //like going backwards using python range built in method
        numbers.addAll(Arrays.asList(1,2,3,4,5,6));
        for(ListIterator<Integer> ListIterator = numbers.listIterator(3); ListIterator.hasPrevious(); ){
            System.out.println(ListIterator.previous());
            ListIterator.remove();
        }
        System.out.println(numbers);

    }
}
