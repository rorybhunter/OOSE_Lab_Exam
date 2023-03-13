import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class OpenWorld {
	
	private int northSouthBoundary, eastWestBoundary; 
	private Player player;
	private ArrayList<Encounter> encounters = new ArrayList<>();
	public boolean gameOver = false;
	
	
	public OpenWorld()
	{

	}
	
	
	private void initialise(int eastWestBoundary, int northSouthBoundary)
	{
		this.eastWestBoundary = eastWestBoundary;
		this.northSouthBoundary=northSouthBoundary;

		this.player = new Player(eastWestBoundary, northSouthBoundary); // creates a new player and sets their playerLocation to 0,0
		createEncounters();
		System.out.println("---------------------------");
	}

	private void createEncounters(){
		ArrayList<String> encounterStrings = new ArrayList<>(Arrays.asList("Wolf", "Lake", "Flatlands", "FinishPoint"));
		Random rand = new Random();
		for (int i=0; i<=eastWestBoundary; i++){
			for (int j=0; j<=northSouthBoundary; j++){
				String randomEncounter = encounterStrings.get(rand.nextInt(encounterStrings.size()));
				Encounter e = EncounterFactory.createEncounter(randomEncounter,new Coordinates(j,i));
				encounters.add(e);
			}
		}
	}
	
	private void playerMove(int northSouthChange, int eastWestChange) {
		if (!gameOver) {

			player.getPlayerLocation().changeCoordinates(new Coordinates(player.getPlayerLocation().getPlayerCoordinates().getNorthSouth() + northSouthChange,
					player.getPlayerLocation().getPlayerCoordinates().getEastWest() + eastWestChange));
			System.out.println("---------------------------");

		} else System.out.println("The game is over");
	}


	public void setGameOver(){
		gameOver = true;
		System.out.println("The game has ended :(");
	}
	

	public static void main(String[]args)
	{

		OpenWorld world = new OpenWorld();
		world.initialise(2,2);
		world.playerMove(1,0);
		world.playerMove(0,1);
		
		
	}

}
