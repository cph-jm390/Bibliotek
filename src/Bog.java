public class Bog {
    boolean udlånt;
    String title;
    int BogID;

    String forfatter;
    int udgivelsesÅr;

    public Bog(String title) {
        this.title = title;
    }

    public Bog(String title, int bogID,boolean udlånt, String forfatter, int udgivelsesÅr ) {
        this.udlånt = udlånt;
        this.title = title;
        this.BogID = bogID;
        this.forfatter=forfatter;
        this.udgivelsesÅr=udgivelsesÅr;


    }

    public int getBogID() {
        return BogID;
    }

    public void setBogID(int bogID) {
        BogID = bogID;
    }

    public boolean isUdlånt() {
        return udlånt;
    }

    public void setUdlånt(boolean udlånt) {
        this.udlånt = udlånt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
