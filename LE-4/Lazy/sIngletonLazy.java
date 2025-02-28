


class singletonLazy {

    private static singletonLazy UniqueInstance;
    public static int counter = 0;

    private singletonLazy() {counter++; }

    public static singletonLazy getInstance(){
        if(UniqueInstance == null){
            UniqueInstance = new singletonLazy();
            
            return  UniqueInstance;
        }
        return UniqueInstance;
    }

    public void print(){
        System.out.println("Hello");
    }

}