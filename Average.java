package Java110Lab;
import java.util.Scanner;
/** class that works with arrays
 *  allows a user to enter 5 scores into an array
 */
public class Average {
    private int[] data;     //array of scores
    private double mean;    //average of all the scores

    //class constant
    public static final int NUM_SCORES = 4;

    /** the constructor. It will allocate memory for the array.
     *
     */
    public Average(){
        int[] data = new int[NUM_SCORES];
        mean = 0;
    }

    /** — Use a for loop to repeatedly display a prompt for the user which should indicate
     that user should enter score number 1, score number 2, etc. Note: The computer starts counting with 0,
     but people start counting with 1, and your prompt should account for this. For example, when the user
     enters score number 1, it will be stored in indexed variable 0
     *
     */
    public void getUserData(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Score #" + (0 + 1) + ": ");
        data[0] = scan.nextInt();
        System.out.print("Enter Score #" + (1 + 1) + ": ");
        data[1] = scan.nextInt();
        System.out.print("Enter Score #" + (2 + 1) + ": ");
        data[2] = scan.nextInt();
        System.out.print("Enter Score #" + (3 + 1) + ": ");
        data[3] = scan.nextInt();
    }

    /** this is a method that uses a for loop to access each score in the array and add it
     to a running total. The total divided by the number of scores (use the length of the array), and the result is
     stored into the mean.
     *
     */
    public void calculateMean(){
        int total = 0;
        for (int x : data){
            total += x;
        }
        mean = total / NUM_SCORES;
    }

    /** returns a String containing data and the mean.
     * @return string with the mean of the scores
     */
    @Override
    public String toString(){
        String str = "The scores are: ";
        for (int x : data){
            str += x + " ";
        }
        str += "and the mean is " + mean;
        return str;
    }

}
