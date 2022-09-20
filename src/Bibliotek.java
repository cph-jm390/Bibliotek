import java.util.HashMap;
import java.util.Map;

public class Bibliotek {
    Map<Integer, Bog> bøger = new HashMap<>();
    Map <Integer,Låner> lånere = new HashMap<>();

    public Bibliotek(Map<Integer, Bog> bøger, Map<Integer, Låner> lånere) {
        this.bøger = bøger;
        this.lånere = lånere;
    }

    public void bogLoad(){

    }

    public void lånerLoad(){

    }

    public void lånBog(Låner låner, Bog bog){

        låner.lånteBøger.add(new Bog(bog.getTitle()));

    }
    public void afleverBog (Låner låner,Bog bog){

        låner.lånteBøger.remove(bog);
    }


}
