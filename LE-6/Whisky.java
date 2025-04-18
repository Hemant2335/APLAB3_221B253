

public class Whisky extends Decorator {
    public Whisky(Offering offer) {
        this.offer = offer;
    }

    String getName(){
        return this.offer.getName() + " with Whisky" ;
    }

    int getPrice(){
        return this.offer.getPrice() + 70;
    }
}
