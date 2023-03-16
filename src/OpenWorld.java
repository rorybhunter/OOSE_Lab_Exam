import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class OpenWorld {
	
	private int northSouthBoundary, eastWestBoundary; 
	private Player player;
	private ArrayList<Encounter> encounters = new ArrayList<>();
	public boolean gameOver = false;
	
	
	public OpenWorld() {}
	
	
	private void initialise(int eastWestBoundary, int northSouthBoundary)
	{
		this.eastWestBoundary = eastWestBoundary;
		this.northSouthBoundary=northSouthBoundary;

		this.player = new Player(eastWestBoundary, northSouthBoundary, this); // creates a new player and sets their playerLocation to 0,0
		createEncounters();
		printSurroundings();
		System.out.println("---------------------------");
	}

	private void createEncounters(){
		ArrayList<String> encounterStrings = new ArrayList<>(Arrays.asList("Wolf", "Lake", "Flatlands", "FinishPoint"));
		Random rand = new Random();
		for (int i=0; i<=eastWestBoundary; i++){
			for (int j=0; j<=northSouthBoundary; j++) {
				String randomEncounter = encounterStrings.get(rand.nextInt(encounterStrings.size()));
				Encounter e = EncounterFactory.createEncounter(randomEncounter, new Coordinates(j, i), player);
				encounters.add(e);
			}
		}
	}
	
	private void playerMove(int northSouthChange, int eastWestChange) {
		if (!gameOver) {

			player.getPlayerLocation().changeCoordinates(new Coordinates(player.getPlayerLocation().getPlayerCoordinates().getNorthSouth() + northSouthChange,
					player.getPlayerLocation().getPlayerCoordinates().getEastWest() + eastWestChange));
			printSurroundings();
			System.out.println("---------------------------");

		} else System.out.println("The game is over");
	}

	public void printSurroundings(){
		String[] nearby = new String[] {"Nothing to the North","Nothing to the East","Nothing to the South","Nothing to the West", };
		for (Encounter encounter : encounters) {

			// if player is to the south of encounter: encounter is to the north.
			if (player.getPlayerLocation().getPlayerCoordinates().isSouth(encounter.encounterCoordinates)) {
				nearby[0] = "To the North: " + encounter.nearbyAlert;
			} else if (player.getPlayerLocation().getPlayerCoordinates().isWest(encounter.encounterCoordinates)) {
				nearby[1] = "To the East: " + encounter.nearbyAlert;
			} else if (player.getPlayerLocation().getPlayerCoordinates().isNorth(encounter.encounterCoordinates)) {
				nearby[2] = "To the South: " + encounter.nearbyAlert;
			} else if (player.getPlayerLocation().getPlayerCoordinates().isEast((encounter.encounterCoordinates))) {
				nearby[3] = "To the West: " + encounter.nearbyAlert;
			}
		}
			for (String alert : nearby){
			System.out.println(alert);
		}
	}
	public void setGameOver(){
		gameOver = true;
		System.out.println("The game has ended");
	}

	public static void main(String[]args)
	{

		OpenWorld world = new OpenWorld();
		world.initialise(2,2);
		world.playerMove(-21,0);
		world.playerMove(0,1);
	}

}
