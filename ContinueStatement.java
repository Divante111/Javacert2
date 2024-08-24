public class ContinueStatement {
    public static void main(String[] args) {
        String[] animals = {"Dog", "Cat", "Lizzard", "Bird", "Snake"};

        for(String animal : animals){
            System.out.println(animal);
        }

        System.out.println("----------------------------------------");
        MY_Loop:
        for(String animal : animals){
            if (animal.equals("Cat")){
                continue;
            }
            System.out.println(animal);
            System.out.println(animal + 1);
        }
        System.out.println("----------------------------------------");
        animal : 
        for(String animal : animals){
            if(animal.equals("Cat")){
                continue animal;
            }
            System.out.println(animal);
        }
        System.out.println("----------------------------------------");
        for(String animal : animals){
            if(animal.equals("Lizzard") || animal.equals("Cat")){
                continue;
            }
            System.out.println(animal);
        }
        System.out.println("----------------------------------------");
        int index = 0;

        
        while (index < animals.length){
            String animal = animals[index];
            index++;
            if (animal.equals("Lizzard")){
                continue;
            }
            System.out.println(animal);
            
        }

    }
}
