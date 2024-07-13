import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BufferedReaderAndScanner
{
    public static void main(String[] args) throws IOException //usually should be handled, this is just for learning purposes
    {
        System.out.println("Enter a number:");

        /*
        // Using BufferedReader to read input from the console
        InputStreamReader in = new InputStreamReader(System.in); // InputStreamReader reads bytes and decodes them into characters
        BufferedReader bf = new BufferedReader(in); // BufferedReader reads text from a character-input stream

        int num = Integer.parseInt(bf.readLine()); // Read a line of text, then parse it as an integer
        System.out.println(num); // Print the entered number

        bf.close(); // Close the BufferedReader
        */

        // Using Scanner to read input from the console
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt(); // Read an integer from the console
        System.out.println(num); // Print the entered number

        sc.close(); // Close the Scanner
    }
}
