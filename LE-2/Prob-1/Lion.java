class Lion extends Animal {
    Lion() {
        super("Lion");
    }

    @Override
    void makeVoice() {
        System.out.println(name + " says: Roar!");
    }
}