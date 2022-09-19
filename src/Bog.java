public class Bog {
    int antal;
    String title;

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

    public Bog(int antal, String title) {
        this.antal = antal;
        this.title = title;

    }
}
