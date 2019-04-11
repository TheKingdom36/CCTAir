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
public class StringAsker
{
    
    // Set up a Scanner.
    private final Scanner scanner;
    // Set up a PrintStream.
    private final PrintStream out;

    // StringAsker Constructor
    public StringAsker(InputStream in, PrintStream out)
    {
        scanner = new Scanner(in);
        this.out = out;
    }

    /**
     * Returns a String which is inputed by the user
     *
     * @param message This is a message which will be displayed to the user
     * @return String String entered by user
     */
    public String ask(String message)
    {
        out.println(message);
        return scanner.nextLine();
    }
}
