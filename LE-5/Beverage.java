
public abstract class Beverage {
    private void pour(int qty){
        System.out.println("Add " + qty + "ml of Beverage");
    }

    protected abstract void addCondament();

    protected void stir(){}

    private void serve(){
        System.out.println("Serve the beverage");
    }

    public final  void TemplateMethod(int qty){
        pour(qty);
        addCondament();
        stir();
        serve();
    }

}
