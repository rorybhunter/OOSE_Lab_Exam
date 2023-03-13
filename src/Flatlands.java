public class Flatlands extends Encounter{

    public Flatlands(String name, Coordinates coordinates, Player player)
    {
        super(name, coordinates, player);
        this.nearbyAlert = "Boring open plains";
        this.encounterDetails = "Nothing to see here. Effect: None";
    }
}
