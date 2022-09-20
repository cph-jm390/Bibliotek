package ÆndringAfSprog;

public class Dansk extends Sprog {

    @Override
    public String hi() {

        return "Velkommen til Mehmet's fedtbiks!";
    }

    @Override
    public String changelanguage() {

        return "\nTryk 1 for at skifte sprog.";
    }

    @Override
    public String selectLangage() {

        return "\nTryk 2 for at skifte sprog til engelsk." +
                "\nTryk 3 for at skifte sprog til finsk.";
    }
}
