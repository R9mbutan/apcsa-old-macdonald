public class Pig implements Animal {
//instantiate attributes. not used in pig though
    private String mySound;
    private String myType;

    // constructor without arguments: default to pig and oink
    public Pig() {
        mySound = getSound();
        myType = getType();
    }

    // default sound
    public String getSound(){
        return "oink";
    }
    // default type
    public String getType(){
        return "pig";
    }

    // constructor with parameters
    public Pig(String type, String sound) {
        myType = type;
        mySound = sound;
    }
}