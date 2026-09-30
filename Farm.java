public class Farm {
    private Animal [] a = new Animal [3];
    Farm () {
        a [0] = new Cow (a[0].getType(),a[0].getSound()) ;
        a [1] = new Chick (a[1].getType(),a[1].getSound()) ;
        a [2] = new Pig (a[2].getType(),a[2].getSound()) ;
    }
    public void animalSounds () {
        for (int i = 0; i < a . length ; i ++) {
            System . out . println ( a [ i ]. getType () + " goes " + a [ i ]. getSound () ) ;
        }
    }
}