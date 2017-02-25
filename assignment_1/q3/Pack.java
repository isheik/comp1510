package q3;

/**
 * Pack class is a class to encode 5 characters in the range from 'A' to 'I'
 * for the MIX computer and decode the encoded value to original characters.
 * 
 * <p>The encoded value is a decimal number calculated as follows.
 * Firstly, the 5 characters chosen are changed in numeral expressions by 
 * using the formula (character - 'A' + 1). Each of the numeral expression 
 * is dealt with as an digit in a base 56 number. Then, the base 56 number
 * is converted to a decimal number which is the encoded value.</p>
 * <p>The decoded value is calculated as follows. The encoded value is
 * divided by the base, 56, to get the remainder and quotient. The remainder
 * in numeral expression corresponds to each character for the MIX computer.
 * The division process is repeated for 5 times to get the original characters.
 * Then, each numeral expression is converted to a character to display in
 * Java program by using the inverse formula which is (remainder + 'A' - 1).
 * </p>
 *
 * @author Keishi Asai, Set E
 * @version 1.0
 */
public class Pack {
    /**
     * <p>This is the main method (entry point) that gets called by the JVM.</p>
     * <p>The main method performs the encode and decode processes while
     * displaying each value. </p>
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        // The base number for the encode and decode.
        final int base = 56;

        // Characters to be encoded.
        final char c1 = 'A';
        final char c2 = 'B';
        final char c3 = 'E';
        final char c4 = 'F';
        final char c5 = 'I';
        
        // Change the characters in numeral expressions for the MIX computer.
        int c1num = c1 - 'A' + 1;
        int c2num = c2 - 'A' + 1;
        int c3num = c3 - 'A' + 1;
        int c4num = c4 - 'A' + 1;
        int c5num = c5 - 'A' + 1;
        
        // Variables to store the remainders in the decode calculation. 
        int place0;
        int place1;
        int place2;
        int place3;
        int place4;
        
        // Variables to store the decoded characters.
        char c1dec;
        char c2dec;
        char c3dec;
        char c4dec;
        char c5dec;
        
        // Store the encoded value and also used for the encode calculation.
        int encodedValue;
        
        // Store the decoded value.
        String decodedValue = "";
        
        System.out.println("Original: " + c5 + c4 + c3 + c2 + c1);
        
        // Encode the numeral expressions to an decimal number.
        encodedValue = (base * base * base * base * c5num)
                        + (base * base * base * c4num) + (base * base * c3num)
                         + (base * c2num) + (c1num);
        System.out.println("Encoded: " + encodedValue);
        
        // Calculate the remainders to decode. 
        place0 = encodedValue % base;
        encodedValue = encodedValue / base;
        place1 = encodedValue % base;
        encodedValue = encodedValue / base;
        place2 = encodedValue % base;
        encodedValue = encodedValue / base;
        place3 = encodedValue % base;
        encodedValue = encodedValue / base;
        place4 = encodedValue % base;
        encodedValue = encodedValue / base;
        
        // Convert the numeral expressions to characters.
        c1dec = (char) (place0 + 'A' - 1);
        c2dec = (char) (place1 + 'A' - 1);
        c3dec = (char) (place2 + 'A' - 1);
        c4dec = (char) (place3 + 'A' - 1);
        c5dec = (char) (place4 + 'A' - 1);
        
        // Concatenate the characters to make the original characters.
        decodedValue = decodedValue + c5dec + c4dec + c3dec + c2dec + c1dec;

        System.out.println("Decoded: " + decodedValue);
        
        // Program end message.
        System.out.println("Question three was called and ran sucessfully.");
    }
};
