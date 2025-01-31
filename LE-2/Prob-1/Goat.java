class Goat extends Animal {
    Goat() {
        super("Goat");
    }

    @Override
    void makeVoice() {
        System.out.println(name + " says: Baa!");
    }
}