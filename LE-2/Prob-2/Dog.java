class Dog extends Animal {
    Dog() {
        super("Dog");
    }

    @Override
    void makeVoice() {
        System.out.println(name + " says: Woof!");
    }
}