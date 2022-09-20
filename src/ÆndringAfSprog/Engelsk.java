package ÆndringAfSprog;

public class Engelsk extends Sprog{

    @Override
    public String hi() {
        return "Hello and welcome!";
    }

    @Override
    public String changelanguage() {
        return "Press 1 to change language.";
    }

    @Override
    public String selectLangage() {
        return "\nPress 1 to change language to Danish.\nPress 3 to change language to Finnish.";

    }
}
