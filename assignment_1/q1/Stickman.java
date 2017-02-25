package q1;

/**
 * Stickman class is a class to display a stick man by using String objects and
 * System.out.println method. Each String object forms a line of the Stick man. 
 * <p>
 * As a program requirement, 2 white spaces are put in each String before 
 * starting to draw the parts of the stick man. Some special symbols, " and \, 
 * used to draw the stick man are escaped by \ since they have special meanings
 * in Java program.
 * </p>
 *
 * @author Keishi Asai, Set E
 * @version 1.0
 */
public class Stickman {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * <p>This method prints out a stick man by using System.out.println 
     * method.</p>
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        //Display a stick man.
        System.out.println("     /\"\"\"\"\"\\");
        System.out.println("    | \\_ _/ |");
        System.out.println("    |  | |  |");
        System.out.println("    | '---' |");
        System.out.println("     \\_____/");
        System.out.println("    ___| |___");
        System.out.println("   /   '-'   \\");
        System.out.println("  |  .     .  |");
        System.out.println("   \\_|_____|_/");
        System.out.println("   /_|     |_\\");
        System.out.println("    |  .-.  |");
        System.out.println("    '._| |_.'");
        System.out.println("    /__| |__\\");
        
        //Program end message.
        System.out.println("Question one was called and ran sucessfully.");
    }
};
