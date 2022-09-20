package ÆndringAfSprog;

public class Dansk extends Sprog {

    @Override
    public String hi() {

        return "Hej og velkommen til slackergruppens bibliotek!";
    }

    @Override
    public String changelanguage() {

        return "Tryk 1 for : Skift sprog";
    }

    @Override
    public String selectLangage() {

        return "Tryk 1 for engelsk" +"\n"+ "Tryk 2 for dansk"+ "\n"+"Tryk 3 for finsk";    }
}
