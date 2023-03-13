public class FinishPoint extends Encounter {

    public FinishPoint(String name, Coordinates coordinates, Player player) {
        super(name, coordinates, player);
        this.nearbyAlert = "see a golden beam of light.";
        this.encounterDetails = "You have reached your goal!";
    }

    @Override
    public void printEncounterDetails() {
        System.out.println(encounterDetails);
        player.getWorld().setGameOver();
    }
}