public class Player {
    private int health;
    private PlayerLocation playerLocation;

    public Player(int eastWestBoundary, int northSouthBoundary){
        this.health = 100;
        this.playerLocation = new PlayerLocation(eastWestBoundary, northSouthBoundary);
        playerLocation.changeCoordinates(new Coordinates(0,0));
    }

    public void takeDamage(int amount){
        health = health - amount;
        if (health<=0){

        }
    }

    public PlayerLocation getPlayerLocation(){
        return playerLocation;
    }
}
