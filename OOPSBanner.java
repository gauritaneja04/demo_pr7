public class OOPSBanner {
    public static void main(String[] args) {

        String[] banner = new String[7];

        banner[0] = String.join("  ",
                "  OOOOO  ",
                " OOOOOOO ",
                "PPPPPPPP ",
                " SSSSSSS ");

        banner[1] = String.join("  ",
                " OO   OO ",
                "OO     OO",
                "PP     PP",
                "SS     SS");

        banner[2] = String.join("  ",
                "OO     OO",
                "OO     OO",
                "PP     PP",
                "SS       ");

        banner[3] = String.join("  ",
                "OO     OO",
                "OO     OO",
                "PPPPPPPP ",
                " SSSSSS  ");

        banner[4] = String.join("  ",
                "OO     OO",
                "OO     OO",
                "PP       ",
                "      SS ");

        banner[5] = String.join("  ",
                " OO   OO ",
                "OO     OO",
                "PP       ",
                "SS     SS");

        banner[6] = String.join("  ",
                "  OOOOO  ",
                " OOOOOOO ",
                "PP       ",
                " SSSSSSS ");

        // Print using for-each loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}