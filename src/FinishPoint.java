public class FinishPoint extends Encounter{

    public FinishPoint(String name, Coordinates coordinates)
    {
        super(name, coordinates);
        this.nearbyAlert = "see a golden beam of light.";
        this.encounterDetails = "You have reached your goal!";
    }
}
