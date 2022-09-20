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

            if (Input.getString(sprog.changelanguage()).equals("1")) {

                switch (Input.getInt(sprog.selectLangage())) {
                    case 1:
                        sprog = new Dansk();
                        break;
                    case 2:
                        sprog = new Engelsk();
                        break;
                    case 3:
                        sprog = new Finsk();
                        break;
                    default:
                        sprog = new Engelsk();
                }
            }
        }
    }
}


//Bruger: arraylist af bøger der kan fjernes
// evt lav bibliotek class til storage af alle bøger
//TODO husk 3 forskellige sprog