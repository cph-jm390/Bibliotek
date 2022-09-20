package ÆndringAfSprog;

public class Finsk extends Sprog {

    @Override
    public String hi() {
        return "Hei ja tervetuloa The Backrooms!";
    }

    @Override
    public String changelanguage() {
        return "Lehdistö 1 varten : Vaihda kieltä";
    }

    @Override
    public String selectLangage() {
        return "\nPaina 1 vaihtaaksesi kielen englanti." +
                "\nPaina 2 vaihtaaksesi kielen yanskan kieli.";
    }
}
