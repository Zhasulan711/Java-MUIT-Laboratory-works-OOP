package GeometricObjects;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is waiting for connections...");

            while (true) {
                try (Socket clientSocket = serverSocket.accept();
                     ObjectInputStream objectInputStream = new ObjectInputStream(clientSocket.getInputStream());
                     ObjectOutputStream objectOutputStream = new ObjectOutputStream(clientSocket.getOutputStream())) {

                    Object receivedObject = objectInputStream.readObject();

                    if (receivedObject instanceof GeometricObject) {
                        GeometricObject geometricObject = (GeometricObject) receivedObject;

                        System.out.println("Client connected from " + clientSocket.getInetAddress());
                        System.out.println("Requested shape type: " + geometricObject.getClass().getSimpleName());

                        if (geometricObject instanceof Circle) {
                            Circle circle = (Circle) geometricObject;
                            System.out.println("Circle Parameters - Radius: " + circle.getRadius());
                        } else if (geometricObject instanceof Rectangle) {
                            Rectangle rectangle = (Rectangle) geometricObject;
                            System.out.println("Rectangle Parameters - " +
                                                 "Width: " + rectangle.getWidth() +
                                                 ", Height: " + rectangle.getHeight()
                            );
                        }

                        double area = geometricObject.calculateArea();
                        System.out.println("Calculated area: " + area);

                        objectOutputStream.writeDouble(area);
                        objectOutputStream.flush();
                    }

                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
