

public class Main {
    public static void main(String[] args) {
        Beverage b = new Whisky();
        b.TemplateMethod(30);
        b =  new Beer();
        b.TemplateMethod(300);
        b = new Rum();
        b.TemplateMethod(600);
    }
}
