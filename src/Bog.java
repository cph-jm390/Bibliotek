public class Bog {
    boolean erUdlånt;
    String title;
    int BogID;

    String forfatter;
    int udgivelsesÅr;

    public Bog(String title) {
        this.title = title;
    }

    public Bog(String title, int bogID,boolean erUdlånt, String forfatter, int udgivelsesÅr ) {
        this.erUdlånt = erUdlånt;
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

    public boolean isErUdlånt() {
        return erUdlånt;
    }

    public void setErUdlånt(boolean erUdlånt) {
        this.erUdlånt = erUdlånt;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
