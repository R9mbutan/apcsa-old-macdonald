public class Animal {
    private String mySound = "zorp";
    private String myType = "alien";
    public String getSound() {
        return mySound;
    }
    public String getType() {
        return myType;
    }
    public Animal(String type, String sound) {
        mySound = sound;
        myType = type;
    }
}