import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * better only iteration loop is for each
 * iterate and modify at the same time use iterate
 * remove or use list items backwards use iterate loop
 */
public class IteratingList2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(createArray());
        
        //forloop
        long startTime = System.currentTimeMillis();
        System.out.println("-------------------------------------");
        System.out.println("common for");
        for(int i = 0; i < names.size(); i ++){
            String temp = names.get(i);
        }
        long totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime);

        System.out.println("-------------------------------------");

        startTime = System.currentTimeMillis();
        //foreach loop
        System.out.println("foreach");
        for (String name : names) {
            String temp = name;
            
        }

        totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime);


        System.out.println("-------------------------------------");
        System.out.println("Iterator");

        startTime = System.currentTimeMillis();

        for (Iterator<String> iterator = names.iterator(); iterator.hasNext();) {
            String elem = iterator.next();
            
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime);


        System.out.println("-------------------------------------");
        System.out.println("List Iterator");

        startTime = System.currentTimeMillis();

        for (ListIterator<String> listIterator = names.listIterator(); listIterator.hasNext();) {
            String elem = listIterator.next();
            
        }
        totalTime = System.currentTimeMillis() - startTime;
        System.out.println(totalTime);

        // String str; 
        // for (Iterator<String> iterator = names.iterator(); iterator.hasNext(); str = iterator.next()){

        // }









    }

    private static String[] createArray(){
        int number = 60_000_000;
        String[] stringArray = new String[number];
        for(int i = 0; i < stringArray.length; i++){
            stringArray[i] = "Array " + i;
        }
        return stringArray;
    }
}
