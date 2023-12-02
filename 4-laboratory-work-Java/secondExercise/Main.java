package secondExercise;

public class Main {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(10.0, 7.0);

        System.out.println("Cylinder volume: " + cylinder.volume());
        System.out.println("Cylinder surface area: " + cylinder.surfaceArea());
    }
}