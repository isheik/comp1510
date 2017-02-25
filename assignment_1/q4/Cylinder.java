package q4;

import java.util.Scanner;

/**
 * Cylinder class calculates and displays the volume of a cylinder.
 * <p>This class requires users to input the radius and height of a cylinder.
 * After getting them, it calculates the volume of the cylinder by using
 * a formula (PI * radius * radius * height).</p>
 *
 * @author Keishi Asai, Set E
 * @version 1.0
 */
public class Cylinder {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * <p>The main method reads the parameters of cylinder from user. Then, it 
     * calculates and print out the cylinder volume.</p>
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Parameters for the cylinder.
        double radius;
        double height;
        double volume;
        
        // Create scanner instance to read user input.
        Scanner scan = new Scanner(System.in);
        
        // Get the radius from user.
        System.out.println("Input the radius of cylinder: ");
        radius = scan.nextDouble();
        
        // Get the height from user.
        System.out.println("Input the height of cylinder: ");
        height = scan.nextDouble();
        
        // Calculate the volume of the cylinder.
        volume = Math.PI * radius * radius * height;
        
        System.out.println("The volume of the cylinder is: " + volume);
        
        // Close the scanner instance.
        scan.close();
        
        // Program end message.
        System.out.println("Question four was called and ran sucessfully.");
    }
};
