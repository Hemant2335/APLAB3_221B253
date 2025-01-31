class Cow extends Animal {
    Cow() {
        super("Cow");
    }

    @Override
    void makeVoice() {
        System.out.println(name + " says: Moo!");
    }
}