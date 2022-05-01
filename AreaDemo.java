package Java110Lab;

public class AreaDemo {
    public static void main(String[] args) {


        double radius = 20.0;

        int length = 10;
        int width = 20;

        double r2 = 10.0;
        double height = 15.0;

        System.out.printf("The area of a circle with a radius of %.2f is %.2f\n", radius, Area.getArea(radius));

        System.out.printf("The area of a rectangle with a length of %d and width of %d is %.2f\n", length, width, Area.getArea(length, width));

        System.out.printf("The area of a cylinder with a radius of %.2f and a height of %.2f is %.2f\n", r2, height, Area.getArea(r2, height));
    }
}
