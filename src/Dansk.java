public class Dansk extends Sprog {

    @Override
    public String hi() {

        return "Hej og velkommen til getName Bank!";
    }

    @Override
    public String changelanguage() {

        return "Ønsker du at skifte sprog?";
    }

    @Override
    public String selectLangage() {

        return "Tryk E for at skifte sprog til engelsk";
    }
}
