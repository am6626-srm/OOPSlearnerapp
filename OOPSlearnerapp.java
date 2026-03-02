/**
 * OOPSBannerApp UC5 - Render OOPS as Banner using Inline Array Initialization
 * @author Developer
 * @version 5.0
 */

public class OOPSlearnerapp{

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define String array variable to hold the OOPS banner lines
        // Each line represents a row in the banner for the letters O, O, P, S

        String[] lines = {

    String.join("   ", " ***** ", " ***** ", " ****** ", " ****** "),
    String.join("   ", "*     *", "*     *", "*     *", "*      "),
    String.join("   ", "*     *", "*     *", "*     *", "*      "),
    String.join("   ", "*     *", "*     *", " ****** ", " ***** "),
    String.join("   ", "*     *", "*     *", "*       ", "      *"),
    String.join("   ", "*     *", "*     *", "*       ", "      *"),
    String.join("   ", " ***** ", " ***** ", "*       ", " ****** ")

};

        // Use a loop to print each line of the banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}