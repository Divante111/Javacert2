public class CharacterArithmetic {
    public static void main(String[] args) {
        char myCharA = 'A';
        char myCharNum = '1';

        System.out.println("mychar A = " + myCharA);
        System.out.println("myCharA isLetter= " + Character.isLetter(myCharA));
        System.out.println("mycharA isDigit= " + Character.isDigit(myCharA));
        System.out.println("myCharNum = " + myCharNum);
        System.out.println("myCharNum isLetter= " + Character.isLetter(myCharNum));
        System.out.println("myCharNum isDigit= " + Character.isDigit(myCharNum));

        char letter = 65; // A + 1 -> B (66)

        int myInt = letter + 3;
        char myNewLetter = (char) myInt;

        System.out.println("letter = " + letter);
        System.out.println("myInt = " + myInt);
        System.out.println("myNewLetter = " + myNewLetter);

        char myChar = 65;
        char newChar = (char) (myChar + 1);

        boolean b = newChar == 'B'; // true
        boolean c = (newChar++ < 'D'); // true

        System.out.println("myChar = " + myChar);
        System.out.println("newChar = " + newChar);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        

    }
}
