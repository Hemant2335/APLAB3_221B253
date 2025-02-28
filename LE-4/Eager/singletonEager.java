
public class singletonEager {
    private static final singletonEager instance = new singletonEager();
    public static int counter = 0;
        // Private constructor to prevent external instantiation
        private singletonEager() {
            counter++;
        }
    
        public static singletonEager getInstance() {
            return instance;
        }
}
