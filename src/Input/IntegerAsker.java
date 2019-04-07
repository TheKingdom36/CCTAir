/**
 * 
 */

package Input;
import java.util.Scanner;
import java.io.InputStream;
import java.io.PrintStream;

public class IntegerAsker {
    private final Scanner scanner;
    private final PrintStream out;

    public IntegerAsker(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    /**
     *Returns an int which is inputed by the user
     * 
     * @param message This is a message which will be displayed to the user
     */
    public int ask(String message) {
       
        System.out.print(message);
        while (true) {
            while (!scanner.hasNextInt()) {
                System.err.println("Incorrect input. Please enter a number");
                scanner.nextLine(); // Discard junk entries
            }
            return scanner.nextInt();
    }
        
        
        
        
    }
}