package firstExercise;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println(name + " помяукал/a.");
    }

    void eat(String food) {
        System.out.println(name + " поел/а " + food);
    }
}