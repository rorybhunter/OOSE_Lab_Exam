public class Lake extends Encounter{

    private final int DAMAGE_AMOUNT = 10;
    public Lake(String name, Coordinates coordinates, Player player) {
        super(name, coordinates, player);
        this.nearbyAlert = "there is a vast expanse of water.";
        this.encounterDetails = "The water is icy cold, you take 10 damage!";
        player.takeDamage(DAMAGE_AMOUNT);
    }
}
