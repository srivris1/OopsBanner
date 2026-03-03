/**
 * OOPS Banner App
 *
 * UC3: Render OOPS banner using String.join()
 *
 * @author Rishit
 * @version 3.0
 */
package srk;
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                " ***** ", "  ***** ", "  ***** ", "  ***** "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *     *", " *      "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *     *", " *      "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *****  ", "  ***** "));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *      ", "       *"));

        System.out.println(String.join(" ",
                "*     *", " *     *", " *      ", "       *"));

        System.out.println(String.join(" ",
                " ***** ", "  ***** ", " *      ", "  ***** "));
    }
}