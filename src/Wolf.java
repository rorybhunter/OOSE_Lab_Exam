public class Wolf extends Encounter{

    public Wolf(String name, Coordinates coordinates, Player player)
    {
        super(name, coordinates, player);
        this.nearbyAlert = "hear distant howling.";
        this.encounterDetails = "You are attacked by wolves and take 20 damage!";
        // implement actual damage here!
    }
}
