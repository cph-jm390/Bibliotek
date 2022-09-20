package ÆndringAfSprog;

public class Engelsk extends Sprog{

    @Override
    public String hi() {
        return "Hello and welcome to the slackergroups library!";
    }

    @Override
    public String changelanguage() {
        return "Press 1 for : Change language";
    }

    @Override
    public String selectLangage() {
        return "Press 1 for english" +"\n"+ "Press 2 for danish"+ "\n"+"Press 3 for finnish";
    }
}
