public class ForEachLoop {
    public static void main(String[] args) {
        String[] names = {"Jimmy", "john", "tom", "anthony"};

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        /// enhanced for loop
        for(String name : names){ 
            System.out.println(name);
        }

        for(String name : names){
            name = name + " " + name;
            System.out.println(name);
        }

        for(String name : names){ 
            System.out.println(name);
        }
        System.out.println("---------------------------------------");

        StringBuilder[] builders = {
            new StringBuilder("For"),
            new StringBuilder("Loop")
        };

        for(StringBuilder builder : builders){
            System.out.println(builder);
        }

        for(StringBuilder builder : builders){
            builder.append("123");
        }

        for(StringBuilder builder : builders){
            System.out.println(builder);
        }

        String pets = "Parrot";

        // cannot iterate through a string
        // for(String pet : pets){

        // }

        // doesnt compile incompatable types
        // for(int name : names){

        // }

        for(char c : pets.toCharArray()){
            System.out.println(c);
        }
    }
}
