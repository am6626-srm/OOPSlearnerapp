
import java.util.HashMap;
import java.util.Map;

public class OOPSlearnerapp {

    // Static method to build character patterns
    public static Map<Character, String[]> buildCharacterPatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return map;
    }

    // Static method to render banner message
    public static void renderBanner(String message, Map<Character, String[]> patterns) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : message.toCharArray()) {

                String[] pattern = patterns.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        Map<Character, String[]> patterns = buildCharacterPatterns();

        String message = "OOPS";

        renderBanner(message, patterns);
    }
}