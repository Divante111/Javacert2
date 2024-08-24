public class BreakStatement {
    public static void main(String[] args) {
        
        // int[] myArray = {1,2,3};

        // can assign labels to code blocks
        myLabel : {
            int[] myArray = {1,2,3};
        }

        String[] animals = {"dog", "cat", "lizzard", "bird", "snake"};

        for(String animal : animals){
            System.out.println(animal);
        }

        // can add labels to for loops
        MyLoop: for(String animal : animals){
            if(animal.equals("cat")){
                break MyLoop;
            }
            System.out.println(animal);
        }

        animal : for(String animal : animals){
            if(animal.equals("cat")){
                break animal;
            }
            System.out.println(animal);
        }

        for(String animal : animals){
            if(animal.equals("lizzard")){
                break;
            }
            System.out.println(animal);
        }

        int index = 0;
            System.out.println("------------------------------------");

        RandomLabel : while (index < animals.length){
            String animal = animals[index];
            
            for(String further : animals){
                
                if(further.equals("lizzard")){
                    break RandomLabel;
                }
                System.out.println(further);
            }
           

            System.out.println(animal);
            index++;

            System.out.println("I broke free from the for loop");
        }
            System.out.println("i broke free from the while");



    }
}
