package org.tnsif.sf.c2tc.execption_handling;

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {

    public static void main(String[] args) {
        System.out.println("Demonstrating Input/Output Exception");

        try {
            // Trying to open a file that doesn't exist
            FileReader fr = new FileReader("non_existing_file.txt");
            fr.close();
        } catch (IOException e) {
            // Handling IOException
            System.out.println("IOException occurred: " + e.getMessage());
        }

        System.out.println("Program continues after handling exception...");
    }
}
