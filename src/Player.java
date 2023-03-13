public class Player {
    private int health;
    private PlayerLocation playerLocation;
    private OpenWorld world;

    public Player(int eastWestBoundary, int northSouthBoundary, OpenWorld world){
        this.health = 100;
        this.playerLocation = new PlayerLocation(eastWestBoundary, northSouthBoundary);
        playerLocation.changeCoordinates(new Coordinates(0,0));
        this.world = world;
    }

    public void takeDamage(int amount){
        health = health - amount;
        if (health<=0){

        }
    }

    public PlayerLocation getPlayerLocation(){
        return playerLocation;
    }

    public OpenWorld getWorld(){
        return world;
    }
}
