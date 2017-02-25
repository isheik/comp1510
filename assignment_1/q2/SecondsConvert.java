package q2;

import java.util.Scanner;

/**
 * SecondsConvert class is a class to convert a time duration in hours, minutes,
 * seconds to all in seconds and then displays the sum of them in seconds. 
 * 
 * <p>This class requires users to input a time duration in hours, minutes and
 * seconds respectively to convert. Then, the time duration in hours, minutes
 * are all converted to seconds, and those are added to the time duration in 
 * seconds input first. After that, the total seconds will be displayed.</p>
 *
 * @author Keishi Asai, Set E
 * @version 1.0
 */
public class SecondsConvert {
    /**
     * <p>This constant represents minutes in an hour, which is used for
     * time unit conversion.</p>
     */
    private static final int MINUTES_IN_AN_HOUR = 60;

    /**
     * <p>This constant represents seconds in a minute, which is used for
     * time unit conversion.</p>
     */
    private static final int SECONDS_IN_A_MINUTE = 60;

    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * <p>This method requires users to input a time duration in hours, minutes
     * and seconds respectively. After converting the hours and minutes to 
     * seconds, the main method calculates the total number of seconds and
     * displays it.</p>
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // Declare variables to store the values of time.
        int hours;
        int minutes;
        int seconds;
        
        // Create scanner instance to read user input.
        Scanner scan = new Scanner(System.in);
        
        // Read a time duration to convert.
        System.out.print("Input hours: ");
        hours = scan.nextInt();        
        System.out.print("Input minutes: ");
        minutes = scan.nextInt();        
        System.out.print("Input seconds: ");
        seconds = scan.nextInt();
        
        // Convert the read time in seconds.
        seconds = hours * MINUTES_IN_AN_HOUR * SECONDS_IN_A_MINUTE
                    + minutes * SECONDS_IN_A_MINUTE + seconds;
        
        // Print out the total number of time in seconds.
        System.out.println("The converted time in seconds is "
                            + seconds + " seconds.");
        
        // Close the scanner instance.
        scan.close();
        
        // Program end message
        System.out.println("Question two was called and ran sucessfully.");
    }
};
