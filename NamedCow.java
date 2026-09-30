public class NamedCow extends Cow {
    // new attribute - name
    private String myName;
    // custom constructor - needs a name
    public NamedCow(String type, String sound, String name){
        myType = type;
        mySound = sound;
        myName = name;
    }
    // returns name
    public String getName(){
        return myName;
    }
}
