package ÆndringAfSprog;

public class Finsk extends Sprog {

    @Override
    public String hi() {
        return "Hei ja tervetuloa getName-pankkiin!";
    }

    @Override
    public String changelanguage() {
        return "Haluatko vaihtaa kieltä?";
    }

    @Override
    public String selectLangage() {
        return "Paina F vaihtaaksesi kielen suomeksi";
    }
}
