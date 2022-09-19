import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ans = " ";

        Sprog sprog = new Engelsk();

        while (true) {

            System.out.println(sprog.hi());
//            System.out.println(dialog.changelanguage());
//            ans = scanner.nextLine();

            if (Input.getString(Sprog.changelanguage()).equalsIgnoreCase("y")) {
//                System.out.println(dialog.selectLangage());
//                ans = scanner.nextLine();

                switch (Input.getString(Sprog.selectLangage())) {
                    case "E":
                        sprog = new Engelsk();
                        break;
                    case "F":
                        sprog = new Finsk();
                        break;
                    case "D":
                    default:
                        sprog = new Dansk();
                }
            }
        }
    }
}


//Bruger: arraylist af bøger der kan fjernes
// evt lav bibliotek class til storage af alle bøger
//TODO husk 3 forskellige sprog