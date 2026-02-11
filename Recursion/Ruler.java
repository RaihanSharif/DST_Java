package Recursion;

/**
 * Draws English/imperial style ruler using recursion. 
 * Credit Goodrich and Tamassia 2010
 */
public class Ruler {
    /**
     * Draws the first major labelled notch. 
     * Then draws all the minor, non-labelled notches,
     * then draw the major labelled notch
     * @param nInches length of the ruler in inches
     * @param majorL the label of the major notch
     */
    public static void drawRuler(int nInches, int majorL) {
        drawOneTick(majorL, 0);
        for (int i = 1; i <= nInches; i++) {
            drawTicks(majorL - 1);
            drawOneTick(majorL, i);
        }

    }

    /**
     * recursively draws the ticks. First the left subjection.
     * Then the middle, then the right. 
     * @param tickLength the height of the notch
     */
    public static void drawTicks(int tickLength) {
        if (tickLength > 0) {
            drawTicks(tickLength - 1);  // recrursively draw the left ticks
            drawOneTick(tickLength);    // draw the centre tick
            drawTicks(tickLength - 1);  // recursively draw the right ticks
        }
    }

    /**
     * Draws a single tick of specified length
     * @param tickLength
     */
    public static void drawOneTick(int tickLength) {
        drawOneTick(tickLength, -1);  // initial drawing has no label as label is < 0

    }

    public static void drawOneTick(int tickLength, int tickLabel) {
        for (int i = 0; i < tickLength; i++) {
            System.out.print("-");
        }
        if (tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.println("");
    }

    public static void main(String args[]) {
        Ruler.drawRuler(2, 4);
    }
}