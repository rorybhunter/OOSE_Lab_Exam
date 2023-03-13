public class EncounterFactory {
    public static Encounter createEncounter(String type, Coordinates coordinates, Player player) {
        switch (type) {
            case "Flatlands":
                return new Flatlands(type, coordinates, player);
            case "FinishPoint":
                return new FinishPoint(type, coordinates, player);
            case "Wolf":
                return new Wolf(type, coordinates, player);
            case "Lake":
                return new Lake(type, coordinates, player);
            default:
                throw new IllegalArgumentException("Invalid encounter type: " + type);
        }
    }
}
