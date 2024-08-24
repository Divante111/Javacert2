package academy;

import java.util.Arrays;

public class NestedLoop {
    public static void main(String[] args) {
        for(int hours = 1; hours <= 6; hours++){
            for(int minutes = 0; minutes < 60; minutes++){
                // System.out.println(hours + ":" + minutes);
            }
        }

        int[][] myArray = {
            {1,2,3}, 
            {4,5,6},
            {7,8,9,}
        };

        System.out.println(Arrays.toString(myArray));

        OUTTER:
        for (int[] rowArray : myArray){
            INNER:
            for(int i = 0; i < rowArray.length; i++){
                if(rowArray[i] % 2 == 0){
                    System.out.print("  ");
                    // break INNER;
                    // continue INNER;
                    continue OUTTER;
                }
                System.out.print(rowArray[i] + " ");
            }
            System.out.println();
        }
        System.out.println("\n--------------------------------");
        int x = 10;
         while (x > 0){
            do { 
                x -=1;
            } while (x > 5);
            x--;
            System.out.println(x);
         }

         int[] random = {6, -4, 12, 0, -10};
         int j = 12;
         int y = Arrays.binarySearch(random, j);
         System.out.println(y);

         switch(120){
            default:
            System.out.println("default");
            case 334:
            System.out.println("something");
            case 120:
            System.out.println("random 0 ");
            case 33:
            System.out.println("printing");
         }
    }
}
