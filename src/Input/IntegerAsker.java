/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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