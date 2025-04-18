
public class Rum extends Decorator {

    public Rum(Offering offer) {
        this.offer = offer;
    }

    String getName(){
        return this.offer.getName() + " with Rum" ;
    }

    int getPrice(){
        return this.offer.getPrice() + 55;
    }
    
}
