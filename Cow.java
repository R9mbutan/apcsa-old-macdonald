public class Cow implements Animal {
    private String mySound;
    private String myType;

    public Cow() {
        mySound = getSound();
        myType = getType();
    }

    public String getSound(){
        return "moo";
    }
    public String getType(){
        return "cow";
    }

    public Cow(String type, String sound) {
        myType = type;
        mySound = sound;
    }
}