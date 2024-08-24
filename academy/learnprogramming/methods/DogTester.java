package academy.learnprogramming.methods;

public class DogTester {
    public static void main(String[] args) {
        Dog husky = new Dog();
        System.out.println(husky.count);

        System.out.println(Dog.count);

        Dog anotherDog = new Dog();
        anotherDog.incrementCounter();

        Dog.incrementCounter();
        System.out.println(Dog.count);

        husky = null;
        anotherDog = null;

        System.out.println(Dog.count);

        System.out.println(husky.count);

        System.out.println(anotherDog.count);

        Dog.count = 10;

        Dog newDog = new Dog();

        Dog dog2 = new Dog();

        newDog.count = 5;
        System.out.println(Dog.count);
        System.out.println(dog2.count);
        System.out.println(newDog.count);

        newDog.count = 11;

        System.out.println(Dog.count);
    }
}
