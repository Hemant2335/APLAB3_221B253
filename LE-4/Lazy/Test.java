
public class Test {


    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i++){
            singletonLazy ob = singletonLazy.getInstance();
            System.out.println("Conuter = " + singletonLazy.counter);
        }
    }
    
}
