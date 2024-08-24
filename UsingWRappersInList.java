
import java.util.ArrayList;
import java.util.List;


public class UsingWRappersInList {
    public static void main(String[] args) {
        // List<double> doubleList = new ArrayList<>(); can't use primitive data type need to use primitive wrapper classes
        List<Double> doubleList = new ArrayList<>();

        doubleList.add(10.5); //autoboxing
        doubleList.add(55.10);
        doubleList.remove(55.10);
        double first = doubleList.get(0);
        System.out.println(first);
        System.out.println(doubleList);

        List<Integer> number = new ArrayList<>();

        number.add(null);
        System.out.println(number);

        // int umber = number.get(0); null pointer exception primitives cant hold null

        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.remove(1);
        System.out.println(nums);
        

    }
}
