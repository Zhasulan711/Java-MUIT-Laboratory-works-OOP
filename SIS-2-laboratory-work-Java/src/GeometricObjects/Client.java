package GeometricObjects;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8080); //127.0.0.1:8080
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
             Scanner scanner = new Scanner(System.in)) {

            while (true) {
                System.out.print("Enter the shape type (C for GeometricObjects.Circle, R for GeometricObjects.Rectangle, Q to quit): ");
                String input = scanner.nextLine();

                if (input.equalsIgnoreCase("Q")) {
                    break;
                }

                GeometricObject geometricObject;

                if (input.equalsIgnoreCase("C")) {
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    scanner.nextLine();
                    geometricObject = new Circle(radius);
                } else if (input.equalsIgnoreCase("R")) {
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    System.out.print("Enter the height of the rectangle: ");
                    double height = scanner.nextDouble();
                    scanner.nextLine();
                    geometricObject = new Rectangle(width, height);
                } else {
                    System.out.println("Invalid input. Please enter C, R, or Q.");
                    continue;
                }

                objectOutputStream.writeObject(geometricObject);
                objectOutputStream.flush();

                double area = objectInputStream.readDouble();
                System.out.println("The area of the shape is: " + area);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
