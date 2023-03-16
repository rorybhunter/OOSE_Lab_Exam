public class Wolf extends Encounter{

    private final int DAMAGE_AMOUNT = 20;
    public Wolf(String name, Coordinates coordinates, Player player)
    {
        super(name, coordinates, player);
        this.nearbyAlert = "hear distant howling.";
        this.encounterDetails = "You are attacked by wolves and take 20 damage!";
        player.takeDamage(DAMAGE_AMOUNT);
    }
}
