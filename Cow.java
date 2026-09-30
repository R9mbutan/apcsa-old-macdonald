public class Cow implements Animal {
    //instantiate attributes as protected because NamedCow needs these
    protected String mySound;
    protected String myType;

    // argumentless --> use default
    public Cow() {
        mySound = getSound();
        myType = getType();
    }

    // default sound
    public String getSound(){
        return "moo";
    }
    // default type
    public String getType(){
        return "cow";
    }

    //constructor with parameters
    public Cow(String type, String sound) {
        myType = type;
        mySound = sound;
    }
}