import java.util.HashMap;
import java.util.Map;

/**
 * OOPSBannerApp - Modular Version (UC8 Fixed Alignment)
 * Uses HashMap for pattern management and reusable methods for rendering.
 */
public class OOPSBannerAppuc8 {

    // Store patterns using Collections Framework
    private static final Map<Character, String[]> charPatterns = new HashMap<>();

    static {
        // Each row is EXACTLY 9 characters wide

        charPatterns.put('O', new String[]{
            "   ***** ",
            "  **   **",
            " **     *",
            " **     *",
            " **     *",
            "  **   **",
            "   ***** "
        });

        charPatterns.put('P', new String[]{
            " ******  ",
            " **   ** ",
            " **   ** ",
            " ******  ",
            " **      ",
            " **      ",
            " **      "
        });

        charPatterns.put('S', new String[]{
            "   ***** ",
            "  **   **",
            " **      ",
            "   ***** ",
            "       **",
            " **   ** ",
            "   ***** "
        });
    }

    public static void main(String[] args) {
        renderMessage("OOPS");
    }

    /**
     * Render banner message using stored patterns
     */
    public static void renderMessage(String message) {

        final int bannerHeight = 7;
        String messageUpper = message.toUpperCase();

        for (int row = 0; row < bannerHeight; row++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : messageUpper.toCharArray()) {

                String[] pattern = charPatterns.get(c);

                if (pattern != null) {
                    lineBuilder.append(pattern[row]).append("  "); // space between letters
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}