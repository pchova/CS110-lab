package Java110Lab;
import java.io.*;
import java.util.Scanner;

/**
 * This program creates a list of songs for a playlist
 * by reading from a file.
 * In PlayList.java, there are comments indicating where the missing code is to be placed. Declare an
 * array of Songs, called songlist, with a size of 6.
 * Fill the array by creating a new song with the title and artist and storing it in the appropriate position in
 * the array.
 */
public class PlayList
{
    public static void main(String[] args) throws IOException
    {
        Scanner input = new Scanner(new File("classics.txt"));
        String title;
        String artist;
        final int NUM_SONGS = 6;

// ADD LINES FOR TASK #2 HERE
// Declare an array of Song objects, called songlist, with a size of NUM_SONGS
        Song[] songlist = new Song[NUM_SONGS];

// ADD LINES FOR TASK #3 HERE
// Fill the array by creating a new song with
// the title and artist and storing it in the
// appropriate position in the array

    for (int count = 0; count < NUM_SONGS; count++){
        title = input.nextLine();
        artist = input.nextLine();
        songlist[count] = new Song(title, artist);
    }

// ADD LINES FOR TASK #4 HERE
// Print the contents of the array to the console }
        for(Song s : songlist) {
            System.out.println(s);
        }

        input.close();
    }
}
