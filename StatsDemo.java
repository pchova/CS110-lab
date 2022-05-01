package Java110Lab;
import java.util.Scanner;
import java.io.*;
/**
 This class reads numbers from a file, calculates the
 mean and standard deviation, and writes the results
 to a file.
 CS110 Lab 2 Spring 2022 Jackie Horton
 */
public class StatsDemo {
    public static void main(String[] args) throws IOException {
        double sum = 0; // The sum of the numbers
        int count = 0; // The number of numbers added
        double mean = 0; // The average of the numbers
        double stdDev = 0; // The standard deviation
        String line; // To hold a line from the file
        double difference; // The value and mean difference

        // Create an object of type Scanner
        Scanner keyboard = new Scanner(System.in);
        String filename; // The user input file name

        // Prompt the user and read in the file name
        System.out.println("This program calculates " +
                "statistics on a file " +
                "containing a series of numbers");
        System.out.print("Enter the file name: ");
        filename = keyboard.nextLine();

        // TASK#4 - Create a File object passing it the filename
        // Create a Scanner object passing File object
        File file2 = new File(filename);
        Scanner inputFile = new Scanner(file2);

        //Create a PrintWriter object and create a new file called Results.txt
        PrintWriter outputFile = new PrintWriter("Results.txt");

        // Loop until you are at the end of the file
        while(inputFile.hasNext()){
            double number  = inputFile.nextDouble();
            sum += number;
            count++;
        }
        //close the input file
        inputFile.close();
        //calculate the mean
        mean = sum / count;

        // ADD LINES FOR TASK #5 HERE
        // Reconnect File object passing it the filename
        // Reconnect Scanner object passing File object
        Scanner readFile = new Scanner(new File(filename));
        // Reinitialize the sum of the numbers
        // Reinitialize the number of numbers added
        sum = 0;
        count = 0;
        // Loop until you are at the end of the file
        while(readFile.hasNext()){
            double num = readFile.nextDouble();             // Read a double value
            difference = num-mean;                           // Subtract the mean
            sum += Math.pow(difference,2);                   // Add the square of the difference to the sum
            count++;                                        // Increment the counter
        }
        // Close the input file
        readFile.close();
        // Store the calculated standard deviation
        double variance = sum / count;
        stdDev = Math.sqrt(variance);

        //Print the mean and standard deviation to the output file using a three decimal format
        outputFile.printf("Mean: %.3f\n", mean);
        outputFile.printf("Standard Deviation: %.3f\n", stdDev);
        //Close the output file
        outputFile.close();
    }
}