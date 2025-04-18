
public class Jin extends  Decorator {
    public Jin(Offering offer) {
        this.offer = offer;
    }

    String getName(){
        return this.offer.getName() + " with Jin" ;
    }

    int getPrice(){
        return this.offer.getPrice() + 60;
    }
}
