public class Udlån {

    //void lånBog bogantal -1 fx, add bog til låner arraylist
    //void aflevérBog bogantal +1 fx

    public void lånBog(Låner låner,Bog bog){
        bog.setAntal(bog.getAntal()-1);
        låner.lånteBøger.add(new Bog(bog.getTitle()));

    }
    public void afleverBog (Låner låner,Bog bog){
        bog.setAntal(bog.getAntal()+1);
        låner.lånteBøger.remove(bog);
    }
}


