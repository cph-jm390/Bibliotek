package ÆndringAfSprog;

public class Finsk extends Sprog {

    @Override
    public String hi() {
        return "Hei ja tervetuloa getName-pankkiin!";
    }

    @Override
    public String changelanguage() {
        return "Lehdistö 1 varten : Vaihda kieltä";
    }

    @Override
    public String selectLangage() {
        return "Paina 1 vaihtaaksesi kielen englanti \\r\\n Paina 2 vaihtaaksesi kielen yanskan kieli\\r\\nPaina 3 vaihtaaksesi kielen suomeksi";
    }
}
