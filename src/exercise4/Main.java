package exercise4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Triangle[] triangles = new Triangle[5];

        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Enter the three sides of triangle " + (i + 1) + ":");
                double side1 = scanner.nextDouble();
                double side2 = scanner.nextDouble();
                double side3 = scanner.nextDouble();
                triangles[i] = new Triangle(side1, side2, side3);
            } catch (InvalidTriangleException e) {
                System.out.println("Error: " + e.getMessage());
                // If triangle creation fails, set it to null
                triangles[i] = null;
            }
        }

        // Calculate and print the area of the fifth triangle
        if (triangles[4] != null) {
            double area = triangles[4].calculateArea();
            System.out.println("Area of the fifth triangle: " + area);
        } else {
            System.out.println("Unable to calculate area of the fifth triangle as it was not properly initialized.");
        }
    }
}
