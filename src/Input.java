import java.util.Scanner;

public class Input {

    public static String getString(String s) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(s + " :  ");

        return scanner.nextLine();
    }

    public static int getInt(String s) {

        int svar;
        while (true) {
            try {
                svar = Integer.parseInt(getString(s));
                break;

            } catch (Exception e) {

                e.printStackTrace();
                System.out.println("You must write a number!");
            }

        }
        return svar;
    }
}
