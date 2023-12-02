package secondExercise;

public class Cylinder extends ThreeDGeometric {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public double surfaceArea() {
        double baseArea = 2 * Math.PI * Math.pow(radius, 2);
        double lateralArea = 2 * Math.PI * radius * height;
        return baseArea + lateralArea;
    }
}