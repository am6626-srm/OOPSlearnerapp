public class OOPSlearnerapp {

    public static void main(String[] args) {
        printOOPS();
    }

    private static void printOOPS() {

        String star = "*";
        String space = " ";

        String line1 = String.join("",
                star, star, star, star, star, space,
                star, star, star, star, star, space,
                star, star, star, star, star, space,
                star, star, star, star, star
        );

        String line2 = String.join("",
                star, space, space, space, star, space,
                star, space, space, space, star, space,
                star, space, space, space, space, space,
                star, space, space, space, star
        );

        String line3 = String.join("",
                star, space, space, space, star, space,
                star, star, star, star, star, space,
                star, star, star, star, star, space,
                star, space, space, space, star
        );

        String line4 = String.join("",
                star, space, space, space, star, space,
                star, space, space, space, star, space,
                space, space, space, space, star, space,
                star, space, space, space, star
        );

        String line5 = String.join("",
                star, star, star, star, star, space,
                star, star, star, star, star, space,
                star, star, star, star, star, space,
                star, star, star, star, star
        );

        System.out.println(line1);
        System.out.println(line2);
        System.out.println(line3);
        System.out.println(line4);
        System.out.println(line5);
    }
}