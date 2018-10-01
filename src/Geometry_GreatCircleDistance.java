import java.util.Scanner;

/* The task is to prompt the user for two coordinates (x, y) in a sphere and then make the program calculate the distance
between the two points*/
public class Geometry_GreatCircleDistance {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

    // Prompting the user for the coordinates
        System.out.println("Please enter the first coordinate: ");
        System.out.print("Enter, the number for x: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the number for y: ");
        double y1 = input.nextDouble();
        System.out.println("Please enter the second coordinate: ");
        System.out.print("Enter the number for x: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the number for y: ");
        double y2 = input.nextDouble();

        double xRad1 = Math.toRadians(x1);
        double yRad1 = Math.toRadians(y1);
        double xRad2 = Math.toRadians(x2);
        double yRad2 = Math.toRadians(y2);

        double radius = 6371.01;
        double distance = radius * Math.acos((Math.sin(xRad1) * Math.sin(xRad2)) + (Math.cos(xRad1) * Math.cos(xRad2)) * Math.cos(yRad1 - yRad2));

        System.out.println(
                "The distance of coordinate: " + "(" + x1 + "," + y1 +")" + " and " + "(" + x2 + "," + y2 + ")" + " is " +
        distance);
    }

}
