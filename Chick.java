public class Chick extends Animal {

    public Chick(String string, String string2) {
        //TODO Auto-generated constructor stub
    }

    @Override 
    public String getSound() {
        if (Math.random()>0.5) return "cluck";
        else return "";
    }
}