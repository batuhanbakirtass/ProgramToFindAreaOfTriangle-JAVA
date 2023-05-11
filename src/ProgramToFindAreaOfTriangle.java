import java.util.Scanner;

public class ProgramToFindAreaOfTriangle {
    public static void main(String[] args) {
        // Define variables
        double a, b, c, u, area;

        // Get input from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st side: ");
        a = input.nextDouble();
        System.out.print("Enter the 2nd side: ");
        b = input.nextDouble();
        System.out.print("Enter the 3rd side: ");
        c = input.nextDouble();

        u = (a + b + c) / 2;
        area = Math.sqrt(u * (u - a) * (u - b) * (u - c));
        System.out.println("Area of the triangle: " + area);

    }
}
