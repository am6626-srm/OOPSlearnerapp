public class OOPSlearnerapp {

    public static void main(String[] args) {
        printOOPS();
    }

    private static void printOOPS() {

        String star = "*";
        String space = " ";

        String[] banner = {

            String.join("", 
                    star, star, star, star, star, space,
                    star, star, star, star, star, space,
                    star, star, star, star, star),

            String.join("", 
                    star, space, space, space, star, space,
                    star, space, space, space, star, space,
                    star, space, space, space, star),

            String.join("", 
                    star, star, star, star, star, space,
                    star, star, star, star, star, space,
                    star, star, star, star, star),

            String.join("", 
                    star, space, space, space, star, space,
                    star, space, space, space, star, space,
                    star, space, space, space, star),

            String.join("", 
                    star, star, star, star, star, space,
                    star, star, star, star, star, space,
                    star, star, star, star, star)
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}