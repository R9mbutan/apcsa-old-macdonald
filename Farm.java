public class Farm {
    //create animal array
    private Animal [] a = new Animal [3];
    Farm () {
        a [0] = new NamedCow ("cow", "moo", "Future Burger") ;
        a [1] = new Chick ("chick", "cluck", "cheep") ;
        a [2] = new Pig ("pig", "oink") ;
    }
    //print animal sounds using the animal object array
    public void animalSounds () {
        for (int i = 0; i < a . length ; i ++) {
            System . out . println ( a [ i ]. getType () + " goes " + a [ i ]. getSound () ) ;
        }
    }
    //print the cow and her name 🍔
    public void nameThatCow() {
        System.out.println("The cow is known as " +((NamedCow)a[0]).getName());
    }
}
