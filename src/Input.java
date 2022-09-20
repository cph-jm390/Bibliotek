import java.util.Scanner;

public class Input {

    Scanner scan = new Scanner(System.in);

    public static String getString(String changelanguage) {

        return changelanguage;
    }

    public int nySession() {
        System.out.println("angiv låner ID med tal");

        String input = scan.nextLine();
        return getInt(input);
    }

    /*
    public static String getString(String s){
        Scanner scanner = new Scanner (System.in);
        System.out.println(s+" : ");
        return scanner.nextLine();
    }

     */
    public static int getInt(String s){
        int svar = 0;
        while (true) {
            try {
                svar = Integer.parseInt(getString(s));
                break;
            } catch (Exception e) {

                e.printStackTrace();
                //RuntimeException(e);
                System.out.println("giv et tal, moron");
            }
        }
        return svar;
    }
}
