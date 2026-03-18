/**
 * OOPS Banner App
 *
 * UC6: Refactor banner logic into static helper methods
 *
 * @author Rishit
 * @version 6.0
 */
package srk;

public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Combine patterns line by line.
        String[] bannerLines = new String[7];

        for (int i = 0; i < 7; i++) {
            bannerLines[i] = String.join(" ", oPattern[i], oPattern[i], pPattern[i], sPattern[i]);
        }

        // Print banner.
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    private static String[] getOPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    private static String[] getPPattern() {
        return new String[] {
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    private static String[] getSPattern() {
        return new String[] {
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }
}
