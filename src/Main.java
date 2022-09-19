import ÆndringAfSprog.Dansk;
import ÆndringAfSprog.Engelsk;
import ÆndringAfSprog.Finsk;
import ÆndringAfSprog.Sprog;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String ans = " ";

        Sprog sprog = new Engelsk();

        while (true) {

            System.out.println(sprog.hi());

            if (Input.getString(Sprog.changelanguage()).equalsIgnoreCase("y")) {

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