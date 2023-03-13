public class Lake extends Encounter{

    public Lake(String name, Coordinates coordinates, Player player) {
        super(name, coordinates, player);
        this.nearbyAlert = "there is a vast expanse of water.";
        this.encounterDetails = "The water is icy cold, you take 10 damage!";
        // implement actual damage here!
    }
}
