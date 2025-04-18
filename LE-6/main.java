

public class main {
    public static void main(String[] args) {
        Offering offer = new Coffee();
        offer = new Rum(offer);
        offer = new Whisky(offer);
        offer = new Jin(offer);
        System.out.println("Name : " + offer.getName() + ", Price : " + offer.getPrice());
    }
}
