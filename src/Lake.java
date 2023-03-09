public class Lake extends Encounter{

    public Lake(String name, Coordinates coordinates) {
        super(name, coordinates);
        this.nearbyAlert = "there is a vast expanse of water.";
        this.encounterDetails = "The water is icy cold, you take 10 damage!"
    }
}
