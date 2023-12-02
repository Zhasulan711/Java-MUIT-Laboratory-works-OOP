package fifthExercise;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);

        System.out.println("Circle Area:" + circle.getArea());
        System.out.println("Circle Perimeter" + circle.getPerimeter());
    }
}
