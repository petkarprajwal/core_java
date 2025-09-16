package org.tnsif.sf.c2tc.execption_handling;

public class throwexample {
    public static void main(String[] args) {
        int age = 19;

        try {
            if(age > 18) {
                throw new ArithmeticException("you are eligible");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }

        System.out.println("Rest of the code runs smoothly.");
    }
}
