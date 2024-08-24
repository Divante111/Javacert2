public class CommonArrayProblems {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        for(int i = 1; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int i = 1; i <= numbers.length - 1; i++){
            System.out.println(numbers[i]);
        }

        int[] nums = new int[20];// size only at initilization

        // int size = numbers.length(); this doesnt compile length is not a method

        int size = numbers.length;
        System.out.println(size);

        // numbers.length = 10; can not change the length; doesnt compile 

        
    }
}
