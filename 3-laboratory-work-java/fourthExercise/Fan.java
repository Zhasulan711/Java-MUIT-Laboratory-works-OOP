package fourthExercise;

public class Fan {
    private Speed TypeOfSpeed;
    private boolean On;
    private double Radius;
    public String Color;

    Fan(){
        TypeOfSpeed = Speed.Slow;
        On = false;
        Radius = 5.0;
        Color = "Blue";
    }

    public void setSpeed(Speed speed) {
        this.TypeOfSpeed = speed;
    }

    public void setOn(boolean on) {
        this.On = on;
    }

    public void setRadius(double radius) {
        this.Radius = radius;
    }

    public void setColor(String color) {
        this.Color = color;
    }

    public String toString() {
        if (On) {
            return "Speed: " + TypeOfSpeed + ", Color: " + Color + ", Radius: " + Radius;
        } else {
            return "Color: " + Color + ", Radius: " + Radius + ", Fan is off";
        }
    }
}
