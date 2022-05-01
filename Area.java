package Java110Lab;
import java.lang.Math;
/*Lab #5 CS110
write a class that has three overloaded static methods for calculating
the areas of the following geometric shapes
area of circle: a = pi(r)^2
pie = Math.PI
area of rectangle: a = width x length
area of cylinder: a = pi((r)^2)h
*/
public class Area {

    /** getArea returns the area of a circle
     *  @return area of a circle a = pi * (r^2)
     */
    public static double getArea(double r){
        return Math.PI * Math.pow(r, 2);
    }

    /** getArea returns the area of a rectangle
     *  @return area of a rectangle a = w * l
     */
    public static double getArea(int l, int w){
        return (double)l * w;
    }

    /** getArea returns the area of a cylinder
     *  @return area of a cylinder a= pi * (r^2) * h
     */
    public static double getArea(double r, double h){
        return Math.PI * Math.pow(r,2) * h;
    }

}
