package fourthExercise;

public class Main {
    public static void main(String[] args) {

        Fan fan1 = new Fan();
        Fan fan2 = new Fan();

        fan1.setSpeed(Speed.Fast);
        fan1.setRadius(10.0);
        fan1.setColor("yellow");
        fan1.setOn(true);

        fan2.setSpeed(Speed.Medium);
        fan2.setRadius(5.0);
        fan2.setColor("blue");
        fan2.setOn(false);

        System.out.println("Fan 1: " + fan1);
        System.out.println("Fan 2: " + fan2);
    }
}
