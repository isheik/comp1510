package q5;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * BusinessCard class is a class to create and display a business card,
 * using JFrame. 
 * <p>When the instance of this object is created, a BusinessCardPanel 
 * instance is also created by the constructor of BusinessCard class 
 * to put and draw the contents on it.</p>
 * <p>After creating a BusinessCardPanel instance, this class will draw
 * business card as follows. Firstly, the background color is set by using
 * RGB values. Then, the base of business card is drawn by setColor,
 * fillRect methods. Next, a company logo is set by drawImage method.
 * After that, The frame of business card is drawn by drawRect method.
 * Finally, drawString method is used to place the String information 
 * on the business card.</p>
 *
 * @author Keishi Asai, Set E
 * @version 1.0
 */
public class BusinessCard extends JFrame {
    /**<p>The x position of the text.</p>*/
    private static final int X_POSITION = 20;
    /**<p>The y position of the text.</p>*/
    private static final int Y_POSITION = 20;
    /**<p>The background color parameter for red in RGB.</p>*/
    private static final int BG_RGB_RED = 60;
    /**<p>The background color parameter for green in RGB.</p>*/
    private static final int BG_RGB_GREEN = 255;
    /**<p>The background color parameter for blue in RGB.</p>*/
    private static final int BG_RGB_BLUE = 140;
    /**<p>The x position to start drawing the base/frame of business card.</p>*/
    private static final int X_CARD_START = 20;
    /**<p>The y position to start drawing the base/frame of business card.</p>*/
    private static final int Y_CARD_START = 40;
    /**<p>The x position to finish drawing the base/frame of the card.</p>*/
    private static final int X_CARD_END = 300;
    /**<p>The y position to finish drawing the base/frame of the card.</p>*/
    private static final int Y_CARD_END = 150;
    /**<p>The x position of the company logo image.</p>*/
    private static final int X_IMG_START = 20;
    /**<p>The y position of the company logo image.</p>*/
    private static final int Y_IMG_START = 40;
    /**<p>The x position of my company name.</p>*/
    private static final int X_CORP_NAME = 190;
    /**<p>The y position of my company name.</p>*/
    private static final int Y_CORP_NAME = 55;
    /**<p>The x position of my company address1.</p>*/
    private static final int X_CORP_ADDRESS_1 = 190;
    /**<p>The y position of my company address1.</p>*/
    private static final int Y_CORP_ADDRESS_1 = 70;
    /**<p>The x position of my company address2.</p>*/
    private static final int X_CORP_ADDRESS_2 = 190;
    /**<p>The y position of my company address2.</p>*/
    private static final int Y_CORP_ADDRESS_2 = 85;
    /**<p>The x position of my name.</p>*/
    private static final int X_PERSONAL_NAME = 60;
    /**<p>The y position of my name.</p>*/
    private static final int Y_PERSONAL_NAME = 130;
    /**<p>The x position of my phone number.</p>*/
    private static final int X_PHONE = 60;
    /**<p>The y position of my phone number.</p>*/
    private static final int Y_PHONE = 170;
    /**<p>The x position of my fax number.</p>*/
    private static final int X_FAX = 190;
    /**<p>The y position of my fax number.</p>*/
    private static final int Y_FAX = 170;
    /**<p>The x position of my email.</p>*/
    private static final int X_EMAIL = 60;
    /**<p>The y position of my email.</p>*/
    private static final int Y_EMAIL = 185;
    /**<p>The x position of my website.</p>*/
    private static final int X_WEB = 190;
    /**<p>The y position of my website.</p>*/
    private static final int Y_WEB = 185;
    
    /**
     * <p>The default constructor which sets the title of this app, sets the
     * default close operation to exit, creates a new content pane and finally
     * sets size and sets the visibility of this frame to true (show).</p>
     */
    public BusinessCard() {
        super("KEISHI ASAI");
        final int bCardWidth = 350;
        final int bCardHeight = 280;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(new BusinessCardPanel());
        setSize(bCardWidth, bCardHeight);
        setVisible(true);
    }

    /**
     * <p>A panel that acts as the Frame's content pane.</p>
     */
    class BusinessCardPanel extends JPanel {
        /**
         * <p>An image object that can be used to paint to the panel.</p>
         */
        private Image img;
        /**
         * <p>The default constructor that retrieves an image to draw.</p>
         */
        BusinessCardPanel() {
            img = new ImageIcon(BusinessCardPanel.class.getResource(
                "/q5/company_logo.jpg")).getImage();
        }

        /**
         * <p>Called by the environment when the frame needs to be updated.</p>
         *  
         * @param g the graphics context with which we paint into.
         */
        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            // Set the color of background.
            setBackground(new Color(BG_RGB_RED, BG_RGB_GREEN, BG_RGB_BLUE));
            
            // Set the color of the base of business card and draw it.
            g.setColor(Color.white);
            g.fillRect(X_CARD_START, Y_CARD_START, X_CARD_END, Y_CARD_END);
            
            // Put my company's logo on the business card.
            g.drawImage(img, X_IMG_START, Y_IMG_START, this);
            
            // Set the color of the frame for the business card and draw it.
            g.setColor(Color.black);
            g.drawRect(X_CARD_START, Y_CARD_START, X_CARD_END, Y_CARD_END);
            
            // Draw my business card informations.
            g.drawString("We will solve your problem.", X_POSITION, Y_POSITION);
            g.drawString("Death March Solver Inc.", X_CORP_NAME, Y_CORP_NAME);
            g.drawString("9999 ABC Rd, Burnaby,",
                            X_CORP_ADDRESS_1, Y_CORP_ADDRESS_1);
            g.drawString("BC, A1B 2C3", X_CORP_ADDRESS_2, Y_CORP_ADDRESS_2);
            g.drawString("Keishi Asai", X_PERSONAL_NAME, Y_PERSONAL_NAME);
            g.drawString("Tel (604)000-1111", X_PHONE, Y_PHONE);
            g.drawString("Fax (604)000-1113.", X_FAX, Y_FAX);
            g.drawString("Email abc@fmail.com", X_EMAIL, Y_EMAIL);
            g.drawString("Website www.abc.com", X_WEB, Y_WEB);
        }
    }

    /**
     * <p>The main method.</p>
     * <p>This method creates a BusinessCard instance.</p>
     * 
     * @param args command line arguments.
     */
    public static void main(String[] args) {
        new BusinessCard();
    }
};
