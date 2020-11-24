import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class Bowling {

    
    
    void processTourney(BufferedReader in) {
	// Your code here
    }

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.err.println ("Usage: java Bowling inputFileName");
            System.exit(1);
        }
        BufferedReader input = new BufferedReader (
                new FileReader(args[0]));
        Bowling b = new Bowling();
        b.processTourney(input);
    }
}
