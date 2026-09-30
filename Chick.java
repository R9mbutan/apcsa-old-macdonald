public class Chick implements Animal {
    private String mySound;
    private String myType;

    public Chick() {
        mySound = getSound();
        myType = getType();
    }

    public String getSound(){
        return (Math.random()>0.5) ? "cluck" : "cheep";
    }
    public String getType(){
        return "chick";
    }

    public Chick(String type, String sound) {
        myType = type;
        mySound = sound;
    }
}