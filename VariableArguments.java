
import java.util.Arrays;

public class VariableArguments {


    public static void main(String... args){
        System.out.println(args.length);
        print(args);
        print("Java");
        print(new String[] {"this", "is", "my", "string", "argument"});

        print("variable", "arguments", "are", "a", "nice", "and", "useful", "feature");
        // for(String item : args){
        //     System.out.println(item);
        // }
    }

    // this is a shorter way of passing arguments to a method
    // if i use String[] the above method calls will no longer work
    public static void print(String... myArguments){
        System.out.println(Arrays.toString(myArguments));
    }


    // public static void main(String[] args) {
        
    // }
}
