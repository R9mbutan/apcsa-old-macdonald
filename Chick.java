public class Chick extends Animal {
    public Chick() {
        super("chick", (Math.random()>0.5) ? "cluck" : "cheep");
    }

    public Chick(String type, String sound){
        super(type, sound);
    }
}