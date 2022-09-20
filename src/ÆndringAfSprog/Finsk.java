package ÆndringAfSprog;

public class Finsk extends Sprog {

    @Override
    public String hi() {
        return "Hei ja tervetuloa slackergroupsin kirjastoon!";
    }

    @Override
    public String changelanguage() {
        return "Lehdistö 1 varten : Vaihda kieltä";
    }

    @Override
    public String selectLangage() {
        return "Paina 1 vaihtaaksesi kielen englanti" +"\n"+ "Paina 2 vaihtaaksesi kielen yanskan kieli"+ "\n"+"Paina 3 vaihtaaksesi kielen suomeksi";
    }
}
