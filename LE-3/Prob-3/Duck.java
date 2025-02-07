


abstract class Duck {
    SwimBehavior swimBehavior;
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public Duck(SwimBehavior swimBehavior, FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.swimBehavior = swimBehavior;
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }
    
    void performSwim() {
        swimBehavior.swim();
    }
    
    void performFly() {
        flyBehavior.fly();
    }
    
    void performQuack() {
        quackBehavior.quack();
    }
}
