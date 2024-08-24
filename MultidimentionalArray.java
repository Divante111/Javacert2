public class MultidimentionalArray {
    public static void main(String[] args) {
        // 1d array
        int[] myArray = {0, 1};

        int[][] array = new int[2][4];

        int anotherArray[][] = new int[2][4];

        // this is confusing but still works 
        // dont use this
        int[] myIntArray[] = new int[2][4];

        String[][] my2dArray = new String[][]{
            {"one", "two"}, // first row two elements
            {"three", "four", "five"}, // second row has 3 elements
            {"six", "seven", "eight", "nine"}, // third row 4 elements
            null

        };


        int[][] numberTable = new int[2][3];

        numberTable[0][0] = 1;
        numberTable[0][1] = 2;
        numberTable[0][2] = 3;
        // numberTable[0][3] = 4; // this line is out of bounds

        // 3d array
        // pages(planes), rows, columns
        int[][][] threeArray = new int[3][3][3];
        threeArray[0][0][0] = 1;

        int oneMoreThreeArray[][][] = new int[3][3][3];

        // this is confusing but still works. dont use this
        int[] anotherThreeArray[][];

        int[][][] threeDArray = {
            {{1,2,3}, {4,5,6}, {7,8,8}},
            {{10,11,12}, {13,14,15}, {16,17,18}},
            {{19,20,21}, {22,23,24}, {25,26,27}}
        };

    }
}
