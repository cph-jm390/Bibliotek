package ÆndringAfSprog;

public class Engelsk extends Sprog{

    @Override
    public String hi() {
        return "Hello and welcome!";
    }

    @Override
    public String changelanguage() {
        return "Press 1 for : Change language";
    }

    @Override
    public String selectLangage() {
        return "Press D to change language to Danish " +
                "Press F to change language to Finnish";
    }
}
