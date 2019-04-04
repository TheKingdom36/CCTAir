/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input;
import java.util.Scanner;
import java.io.InputStream;
import java.io.PrintStream;

/**
 *
 * @author Daniel Murphy
 */


public class StringAsker {
    private final Scanner scanner;
    private final PrintStream out;

    public StringAsker(InputStream in, PrintStream out) {
        scanner = new Scanner(in);
        this.out = out;
    }

    public String ask(String message) {
        out.println(message);
        return scanner.nextLine();
    }
}