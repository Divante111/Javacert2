
import java.util.Random;

public class SwitchStatement {
    public static void main(String[] args) {
        int dayOfWeek = 0;

        switch(dayOfWeek){
            case 0: 
                System.out.println("monday");
                break;
            case 1:
                System.out.println("tuesday");
                break;
            case 2:
                System.out.println("wednesday");
                break;
            case 3:
                System.out.println("thursday");
                break;
            case 4:
                System.out.println("friday");
                break;
            default:
                System.out.println("weekend");
                break;

        }
        
        Random rand = new Random();
        int c = rand.nextInt(26) + 'a'; // adding offset to produce lowercase letters

        System.out.println((char) c + ", " + c + ": ");

        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("vowel");
                break;
            case 'y':
            case 'w':
                System.out.println("sometimes a vowel");
                break;
                default:
                System.out.println("constonant");
        }
        int x = 4;
            switch (x) {
                case 4:
                // case x:
                case 'K':
                // case "Test":

                    
                    break;
                default:
                    throw new AssertionError();
            }
            System.out.println((char) 4);
        }



    }

