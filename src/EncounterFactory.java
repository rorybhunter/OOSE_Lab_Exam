public class EncounterFactory {
    public static Encounter createEncounter(String type, Coordinates coordinates) {
        switch (type) {
            case "Flatlands":
                return new Flatlands(type, coordinates);
            case "FinishPoint":
                return new FinishPoint(type, coordinates);
            case "Wolf":
                return new Wolf(type, coordinates);
            case "Lake":
                return new Lake(type, coordinates);
            default:
                throw new IllegalArgumentException("Invalid encounter type: " + type);
        }
    }
}
