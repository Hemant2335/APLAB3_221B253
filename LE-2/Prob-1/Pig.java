class Pig extends Animal {
    Pig() {
        super("Pig");
    }

    @Override
    void makeVoice() {
        System.out.println(name + " says: Oink!");
    }
}