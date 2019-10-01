import java.util.Scanner;

public class apcsacircle {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("\nPlease enter the diameter of your circle: ");
        double diameter = in.nextDouble();

        double area = (diameter / 2);
        double area2 = (area * area) * 3.14;


        System.out.printf("\nThe area of a circle with a diameter of " + diameter + " is %.1f", area2);
        System.out.println("");

        in.close();
      }
}
