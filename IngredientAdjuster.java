package Java110Lab;
import java.util.Scanner;
public class IngredientAdjuster {
    public static void main(String[] args){
        //variables
        final int BATCH = 48;
        double sugar = 1.5;
        double butter = 1.0;
        double flour = 2.75;
        double cookies;
        double conversion;
        Scanner scan = new Scanner(System.in);

        //user input
        System.out.print("How many cookies do you want to make?: ");
        cookies = scan.nextDouble();

        //find the conversion factor
        conversion = cookies / BATCH;

        sugar *= conversion;
        butter *= conversion;
        flour *= conversion;

        System.out.printf("To make %.1f cookies, you need %.2f cups of sugar, " +
                        "%.2f of cups of butter, and %.2f cups of of flour."
                , cookies, sugar, butter, flour);





    }
}
