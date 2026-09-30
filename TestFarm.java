public class TestFarm {
 public static void main(String[] args) {
   /* Commented out:
    // instantiate bagel the cow
    Cow bagel = new Cow("cow", "moooooo");
    // using the object, print out the type + " goes " + sound
    System.out.println("The " + bagel.getType() + " goes " + bagel.getSound());
   */

    //create the farm
    Farm ronald = new Farm();
    //call the two methods
    ronald.animalSounds();
    ronald.nameThatCow();
 }
}
