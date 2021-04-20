package studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double area;
        double radius;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        while (radius <= 0)  {
            System.out.println("Enter a radius greater than 0");
            radius = input.nextDouble();
        }
        area = Circle.getArea(radius);
        System.out.println("The area is " + area);
    }
}
