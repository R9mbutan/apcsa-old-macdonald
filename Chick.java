public class Chick implements Animal {
    //instantiate attributes - set defaults here
    private String mySound = "muhahaha";
    private String myType = "chick";

    // no arguments constructor --> use defaults
    public Chick() {
        mySound = getSound();
        myType = getType();
    }

    //default sound? no not for chicken. chick is weird
    public String getSound(){
        return mySound;
    }
    // default type, defined in instantiation
    public String getType(){
        return myType;
    }

    //randomly choose the first or second sound given
    public Chick(String type, String sound, String sound2) {
        myType = type;
        mySound = (Math.random()>0.5)? sound : sound2;
    }
}