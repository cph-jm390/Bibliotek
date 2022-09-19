public class Bog {
    int antal;
    String title;
    int BogID;

    public Bog(String title) {
        this.title = title;
    }

    public Bog(int antal, String title, int bogID) {
        this.antal = antal;
        this.title = title;
        this.BogID = bogID;

    }

    public int getAntal() {
        return antal;
    }

    public void setAntal(int antal) {
        this.antal = antal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
