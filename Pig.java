public class Pig implements Animal {
    private String mySound;
    private String myType;

    public Pig() {
        mySound = getSound();
        myType = getType();
    }

    public String getSound(){
        return "oink";
    }
    public String getType(){
        return "pig";
    }

    public Pig(String type, String sound) {
        myType = type;
        mySound = sound;
    }
}