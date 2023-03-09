public class Wolf extends Encounter{

    public Wolf(String name, Coordinates coordinates)
    {
        super(name, coordinates);
        this.nearbyAlert = "hear distant howling.";
        this.encounterDetails = "You are attacked by wolves and take 20 damage!";
    }
}
