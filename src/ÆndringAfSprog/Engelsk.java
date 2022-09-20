package ÆndringAfSprog;

public class Engelsk extends Sprog{

    @Override
    public String hi() {
        return "Hello and welcome to the slackergroups library!";
    }

    @Override
    public String changelanguage() {
        return "Press 1 to change language.";
    }

    @Override
    public String selectLangage() {
<<<<<<< HEAD
        return "Press 1 for english" +"\n"+ "Press 2 for danish"+ "\n"+"Press 3 for finnish";
=======
        return "\nPress 1 to change language to Danish.\nPress 3 to change language to Finnish.";

>>>>>>> 392923e20f6f42b66f8666844a2b06b89410fa36
    }
}
