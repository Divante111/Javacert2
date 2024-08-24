package academy.learnprogramming.methods;

public class Person {
    private String firstName;
    private String lastName;

    public Person(){
        this("Eric", "johnson");
    }
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getFullname(){
        return firstName + " " + lastName;
    }
    public static void main(String[] args) {
        
    }
}
