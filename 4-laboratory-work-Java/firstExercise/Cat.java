package firstExercise;

public class Cat extends Animal {

    Cat(String name) {
        super(name);
    }

    void speak() {
        System.out.println(name + " мяукает.");
    }

    void eat(String food, int quantity) {
        System.out.println(name + " кушает " + quantity + " порции " + food);
    }
}