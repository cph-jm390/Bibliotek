import java.util.ArrayList;

public class Låner {
    String navn;
    ArrayList<Bog> lånteBøger;
    int lånerID;

    public Låner(String navn, ArrayList<Bog> lånteBøger, int lånerID) {
        this.navn = navn;
        this.lånteBøger = lånteBøger;
        this.lånerID = lånerID;
    }

    public Låner() {

    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public ArrayList<Bog> getLånteBøger() {
        return lånteBøger;
    }

    public void setLånteBøger(ArrayList<Bog> lånteBøger) {
        this.lånteBøger = lånteBøger;
    }

    public int getLånerID() {
        return lånerID;
    }

    public void setLånerID(int lånerID) {
        this.lånerID = lånerID;
    }
}
