
class Squeaks implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak!");
    }
}

class Mute implements QuackBehavior {
    public void quack() {
        System.out.println("This duck is mute.");
    }
}

// Base Duck class


// Concrete Duck types
class RubberDuck extends Duck {
    public RubberDuck() {
        super(new CanSwim(), new NoFly(), new Squeaks());
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        super(new CanSwim(), new NoFly(), new Mute());
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        super(new CanSwim(), new CanFly(), new Quacks());
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        super(new CanSwim(), new CanFly(), new Quacks());
    }
}

// Main class to test the implementation
public class DuckGame {
    public static void main(String[] args) {
        Duck rd = new RubberDuck();
        Duck wd = new WoodenDuck();
        Duck rhd = new RedHeadDuck();
        Duck ld = new LakeDuck();
        
        System.out.println("Rubber Duck:");
        rd.performSwim();
        rd.performFly();
        rd.performQuack();
        
        System.out.println("\nWooden Duck:");
        wd.performSwim();
        wd.performFly();
        wd.performQuack();
        
        System.out.println("\nRedHead Duck:");
        rhd.performSwim();
        rhd.performFly();
        rhd.performQuack();
        
        System.out.println("\nLake Duck:");
        ld.performSwim();
        ld.performFly();
        ld.performQuack();
    }
}
