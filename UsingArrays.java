import java.util.Arrays;

public class UsingArrays {
    public static void main(String[] args) {
        String[] pets = {"parrot", "cat", "dog"};

        System.out.println(pets[0]);
        System.out.println(pets[1]);
        System.out.println(pets[2]);

        pets[0] = "bird";

    
        for(int i = 0; i < pets.length; i++){
            System.out.println(pets[i]);
        }

        for (int i = 0; i <= pets.length - 1; i++){
            System.out.println(pets[i]);
        }

        System.out.println(pets);
        System.out.println(Arrays.toString(pets));

        int[] number = new int[5];

        System.out.println(Arrays.toString(number));

        String[] newPets = new String[5];

        System.out.println(Arrays.toString(newPets));

        for(int i = 0; i < number.length; i++){
            number[i] = i + 10;
        }
        System.out.println(Arrays.toString(number));

        Integer[] nums = new Integer[4];

        System.out.println(Arrays.toString(nums));

        for(int i = 0; i < nums.length; i++){
            nums[i] = i % 3;
        }

        System.out.println(Arrays.toString(nums));
    }
}
