public class Flatlands extends Encounter{

    public Flatlands(String name, Coordinates coordinates)
    {
        super(name, coordinates);
        this.nearbyAlert = "Boring open plains";
        this.encounterDetails = "Nothing to see here. Effect: None";
    }
}
