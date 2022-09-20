package ÆndringAfSprog;

public class Dansk extends Sprog {

    @Override
    public String hi() {

        return "Hej og velkommen til getName Bank!";
    }

    @Override
    public String changelanguage() {

        return "Tryk 1 for : Skift sprog";
    }

    @Override
    public String selectLangage() {

        return "Tryk E for at skifte sprog til engelsk";
    }
}
