package Java110Lab;
import java.lang.*;
//Lab #3 CS110 Objects Chapter 8
public class ColoredCircle {
    private double radius = 1.0;
    private String color = "blue";

/** Default constructor that sets default values to variables
 *  radius to 1.0 and str to blue
 */
    public ColoredCircle(){
        setRadius(radius);
        setColor(color);
    }

    /** Alternate constructor #1 that takes one parameter, a double
     *  sets radius to provided value, default color to "blue"
     * @param radius
     */
    public ColoredCircle(double radius){
        this.radius = radius;
        setColor(color);
    }

    /** Alternate constructor #2 that takes one parameter, a String
     *  Set color to provided value, default radius to 1.0
     * @param color
     */
    public ColoredCircle(String color){
        this.color = color;
        setRadius(radius);
    }

    /** Default constructor #3 that takes two parameters a double and a String
     *  If a negative radius is positive, assign the absolute value to radius
     * @param radius
     * @param color
     */
    public ColoredCircle(double radius, String color){
        this.radius = Math.abs(radius);
        this.color = color;
    }

    /** getRadius() method
     * @return radius the radius of the circle object
     */
    public double getRadius(){
        return radius;
    }

    /** getColor() method
     * @return str that represents color of object
     */
    public String getColor(){
        return color;
    }

    /** getArea() method
     * @return area of Circle Object
     */
    public double getArea(){
        double area;
        return area = Math.PI * Math.pow(radius, 2);
    }

    /** setRadius() method
     * @param radius sets parameter to instance variable radius
     */
    public void setRadius(double radius){
        this.radius = Math.abs(radius);;
    }

    /** setRadius() method
     * @param color sets parameter to instance variable color
     */
    public void setColor(String color){
        this.color = color;
    }
}
