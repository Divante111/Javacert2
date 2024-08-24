import java.util.Arrays;

public class SearchingArrays {
    /**
     * for binary search methods to work the array must be storted
     * @param args
     */
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 6,7};

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 5));
        System.out.println(Arrays.binarySearch(numbers, 7));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 6));
        System.out.println(Arrays.binarySearch(numbers, 4));

        int[] notStortedNumbers = {5,4, 10, 8, 6};
        System.out.println("-------------------------------------");
        System.out.println(Arrays.binarySearch(notStortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notStortedNumbers, 8));


        /// you get unpredictable results if the array isn't sorted
        Arrays.sort(notStortedNumbers);
        System.out.println(Arrays.toString(notStortedNumbers));
        System.out.println("-------------------------------------");
        System.out.println(Arrays.binarySearch(notStortedNumbers, 5));
        System.out.println(Arrays.binarySearch(notStortedNumbers, 8));



    }
}
