
public class Test {


    public static void main(String[] args) {
        for(int i = 0 ; i < 10 ; i++){
            singletonEager ob = singletonEager.getInstance();
            System.out.println("Conuter = " + singletonEager.counter);
        }
    }
    
}
