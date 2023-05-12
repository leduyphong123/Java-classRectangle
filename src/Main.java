import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("input width = ");
        double width = input.nextDouble();
        System.out.print("input height = ");
        double height = input.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());
        System.out.println(rectangle.disPlay());
    }
}